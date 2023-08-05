package service.booking;

import model.business.Booking;
import repository.booking.BookingRepository;
import repository.booking.IBookingRepository;

import service.booking.booking_sub.RoomContract;
import utilities.MyRegex;

import java.util.List;
import java.util.Scanner;


public class BookingService extends MyRegex implements IBookingService {
    private IBookingRepository bookingRepository = new BookingRepository();
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
        roomContract.add();
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
