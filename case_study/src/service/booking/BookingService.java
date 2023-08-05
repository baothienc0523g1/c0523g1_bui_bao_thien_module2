package service.booking;

import model.business.Booking;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;
import service.customer.CustomerService;
import service.customer.ICustomerService;
import service.employee.EmployeeService;
import service.employee.IEmployeeService;
import service.facility.FacilityService;
import service.facility.IFacilityService;
import utilities.MyLocalDateRegex;
import utilities.MyRegex;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class BookingService extends MyRegex implements IBookingService {
    private IBookingRepository bookingRepository = new BookingRepository();
    private ICustomerService customerService = new CustomerService();
    private IEmployeeService employeeService = new EmployeeService();
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private IFacilityService facilityService = new FacilityService();

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getList() {
        List<Booking> bookingList = bookingRepository.getList();
        for (Booking booking : bookingList) {
            System.out.println(booking);
            System.out.println("--------");
        }
    }

    public boolean bookingIdCheck(String id) {
        boolean flag = true;
        List<Booking> bookingList = bookingRepository.getList();
        for (Booking booking : bookingList) {
            if (booking.getBookingID().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    @Override
    public void add() {
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
        facilityService.getRoomIdList();
        do {
            serviceId = scanner.nextLine();
            if (facilityService.idCheck(serviceId)) {
                System.out.println("ID not found, put a gain");
            }
            if (!myRegex(serviceId, ROOM_SERVICE_ID)) {
                System.out.println("Wrong format, ID: SVRO-NNNN, with N is a number");
            }
        } while (facilityService.idCheck(serviceId) || !myRegex(serviceId, ROOM_SERVICE_ID));

        Booking booking = new Booking(bookingID, dayBook, checkIn,
                checkOut, customerId, serviceId);
        bookingRepository.add(booking);
        System.out.println("Booking with ID " + bookingID + " successfully added");
    }

    @Override
    public void addNewContract() {

    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }
}
