package service.booking.booking_sub;

import model.business.Contract;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;
import service.booking.BookingService;
import service.facility.FacilityService;
import service.facility.IFacilityService;
import utilities.MyLocalDateRegex;

import java.time.LocalDate;
import java.util.Scanner;

public class EditContract extends BookingService {
    private MyLocalDateRegex myLocalDateRegex = new MyLocalDateRegex();
    private IFacilityService facilityService = new FacilityService();
    private IBookingRepository bookingRepository = new BookingRepository();
    private Scanner scanner = new Scanner(System.in);

    public void edit() {
        System.out.println("Enter booking ID");
        String bookingID = scanner.nextLine();
        if (bookingIdCheck(bookingID)) {
            System.out.println("Booking ID not found");
        } else {
            System.out.println("New day book: ");
            LocalDate dayBook = null;
            do {

                dayBook = LocalDate.parse(scanner.nextLine());
                if (!myLocalDateRegex.myDateRegex(dayBook)) {
                    System.out.println("Wrong format of date");
                }

            } while (!myLocalDateRegex.myDateRegex(dayBook));

            System.out.println("New check-in day: ");
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

            System.out.println("New check-out day: ");
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

            System.out.println("New service id: ");
            String serviceId;
            facilityService.getHouseIdList();
            do {
                serviceId = scanner.nextLine();
                if (facilityService.idCheck(serviceId)) {
                    System.out.println("ID not found, put again");
                }
                if (!myRegex(serviceId, HOUSE_SERVICE_ID)) {
                    System.out.println("Wrong format, ID: SVHO-NNNN, with N is a number");
                }
            } while (facilityService.idCheck(serviceId) || !myRegex(serviceId, HOUSE_SERVICE_ID));

            System.out.println("New deposit: ");
            Double deposit = null;
            try {
                deposit = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format of number");
            }

            System.out.println("New total cost: ");
            Double totalCost = null;
            try {
                totalCost = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format of number");
            }
            Contract contract = new Contract(dayBook, checkIn, checkOut, serviceId, deposit, totalCost);
            bookingRepository.edit(bookingID, contract);
        }
    }

}
