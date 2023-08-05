package service.booking;

import controller.controller_sub.BookingController;
import model.business.Booking;
import model.business.Contract;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;

import service.booking.booking_sub.HouseContract;
import service.booking.booking_sub.RoomContract;
import service.booking.booking_sub.VillaContract;
import utilities.MyRegex;

import java.util.List;
import java.util.Scanner;


public class BookingService extends MyRegex implements IBookingService {
    private IBookingRepository bookingRepository = new BookingRepository();
    private BookingController bookingController = new BookingController();
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
        RoomContract roomContract = new RoomContract();
        roomContract.addRoom();
    }

    @Override
    public void addNewContract() {
        System.out.println("Add new contract");
        System.out.println("1. House contract");
        System.out.println("2. Villa contract");
        System.out.println("3. Return to booking menu");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong format of number");
        }
        switch (choice) {
            case 1:
                HouseContract houseContract = new HouseContract();
                houseContract.addHouse();
                break;
            case 2:
                VillaContract villaContract = new VillaContract();
                villaContract.addVilla();
                break;
            case 3:
                bookingController.displayMainMenu();
                break;
            default:
                System.out.println("Wrong format");
                break;
        }
    }

    @Override
    public void displayContract() {
        List<Contract> contracts = bookingRepository.getContractList();
        for (Contract contract : contracts) {
            System.out.println(contract);
        }
    }

    @Override
    public void editContract() {

    }
}
