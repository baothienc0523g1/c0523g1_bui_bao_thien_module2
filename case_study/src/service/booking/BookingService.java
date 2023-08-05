package service.booking;

import model.business.Booking;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;
import service.customer.CustomerService;
import service.customer.ICustomerService;
import utilities.MyRegex;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookingService extends MyRegex implements IBookingService {
    private IBookingRepository bookingRepository = new BookingRepository();
    private ICustomerService customerService = new CustomerService();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getList() {
        List<Booking> bookingList = bookingRepository.getList();
        for (Booking booking : bookingList) {
            System.out.println(booking);
            System.out.println("");
        }
    }

    @Override
    public void add() {
        customerService.getIdAndName();
        System.out.println("Customer ID");
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

        System.out.println("Enter booking ID");
        String bookingID = scanner.nextLine();
        System.out.println("Enter booking day");
        LocalDate dayBook = LocalDate.parse(scanner.nextLine());
        System.out.println("Check-in day");
        LocalDate checkIn = LocalDate.parse(scanner.nextLine());
        System.out.println("Check-out day");
        LocalDate checkOut = LocalDate.parse(scanner.nextLine());
        System.out.println("Service ID");
        String serviceId = scanner.nextLine();

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
