package service.booking.booking_sub;

import model.business.Contract;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;
import service.booking.BookingService;
import service.customer.CustomerService;
import service.customer.ICustomerService;
import service.facility.FacilityService;
import service.facility.IFacilityService;
import utilities.MyLocalDateRegex;

import java.time.LocalDate;
import java.util.Scanner;

public class HouseContract extends BookingService {
    private ICustomerService customerService = new CustomerService();
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private IFacilityService facilityService = new FacilityService();
    private IBookingRepository bookingRepository = new BookingRepository();

    private Scanner scanner = new Scanner(System.in);


    public void addHouse() {
        customerService.getIdAndName();
        System.out.println("Customer ID:");
        String customerId;
        do {
            customerId = scanner.nextLine();
            if (customerService.idCheck(customerId)) {
                System.out.println("ID not found, put a gain");
            }
            if (!myRegex(customerId, CUSTOMER_ID)) {
                System.out.println("Wrong format, ID: KH-NNNN, with N is a number");
            }
        } while (customerService.idCheck(customerId) || !myRegex(customerId, CUSTOMER_ID));

        System.out.println("Enter contract ID (C-NNNN):");
        String contractId;
        do {
            contractId = scanner.nextLine();
            if (!myRegex(contractId, CONTRACT_ID)) {
                System.out.println("Wrong format of contract ID");
            }
        } while (!myRegex(contractId, CONTRACT_ID));

        System.out.println("Booking ID: B-NNNN, with N is a number");
        String bookingID;
        do {
            bookingID = scanner.nextLine();
            if (!myRegex(bookingID, BOOKING_ID)) {
                System.out.println("Wrong format, ID: B-NNNN, with N is a number");
            }
            if (!bookingIdCheck(bookingID)) {
                System.out.println("Booking ID already exist");
            }
        } while (!myRegex(bookingID, BOOKING_ID) || !bookingIdCheck(bookingID));

        System.out.println("Enter booking day");
        LocalDate dayBook = null;
        do {

            dayBook = LocalDate.parse(scanner.nextLine());
            if (!myLocalDateRegex.myDateRegex(dayBook)) {
                System.out.println("Wrong format of date");
            }

        } while (!myLocalDateRegex.myDateRegex(dayBook));

        System.out.println("Check-in day");
        LocalDate checkIn = null;
        do {
            checkIn = LocalDate.parse(scanner.nextLine());
            if (checkIn.isBefore(dayBook)) {
                System.out.println("Check in day must be after booking day: " + dayBook);
            }
            if (!myLocalDateRegex.myDateRegex(checkIn)) {
                System.out.println("Wrong format of date");
            }
        } while (checkIn.isBefore(dayBook) || !myLocalDateRegex.myDateRegex(checkIn));

        System.out.println("Check-out day");
        LocalDate checkOut = null;
        do {
            checkOut = LocalDate.parse(scanner.nextLine());
            if (checkOut.isBefore(checkIn)) {
                System.out.println("Check in day must be after check in day: " + checkIn);
            }
            if (!myLocalDateRegex.myDateRegex(checkOut)) {
                System.out.println("Wrong format of date");
            }
        } while (checkOut.isBefore(checkIn) || !myLocalDateRegex.myDateRegex(checkOut));

        System.out.println("Service ID");

        String serviceId;
        facilityService.getHouseIdList();
        do {
            serviceId = scanner.nextLine();
            if (facilityService.idCheck(serviceId)) {
                System.out.println("ID not found, put a gain");
            }
            if (!myRegex(serviceId, HOUSE_SERVICE_ID)) {
                System.out.println("Wrong format, ID: SVHO-NNNN, with N is a number");
            }
        } while (facilityService.idCheck(serviceId) || !myRegex(serviceId, VILLA_SERVICE_ID));

        System.out.println("Deposit");
        Double deposit;
        do {
            deposit = Double.parseDouble(scanner.nextLine());
            if (!myRegex(String.valueOf(deposit), NUMBER_FORMAT)) {
                System.out.println("Wrong format of number");
            }
        } while (!myRegex(String.valueOf(deposit), NUMBER_FORMAT));

        Double totalCost;
        do {
            totalCost =  Double.parseDouble(scanner.nextLine());
            if (!myRegex(String.valueOf(totalCost), NUMBER_FORMAT)) {
                System.out.println("Wrong format of number");
            }
        } while (!myRegex(String.valueOf(totalCost), NUMBER_FORMAT));


        Contract contract = new Contract(dayBook, checkIn, checkOut,
                customerId, serviceId, contractId, bookingID,
                deposit, totalCost);
        bookingRepository.createNewContracts(contract);
        System.out.println("Create new contract with ID: " + contractId + " successfully");
    }
}
