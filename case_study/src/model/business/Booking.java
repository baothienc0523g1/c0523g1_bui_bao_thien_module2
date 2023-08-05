package model.business;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable, Comparable<Booking> {
    private String bookingID;
    private LocalDate dayBook;
    private LocalDate checkInDay;
    private LocalDate checkOutDay;
    private String customerId;
    private String serviceId;
    private static final long serialVersionUID = -120345;


    public Booking(String bookingID, LocalDate dayBook,
                   LocalDate checkInDay, LocalDate checkOutDay,
                   String customerId, String serviceId) {
        this.bookingID = bookingID;
        this.dayBook = dayBook;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public String toStringForSave() {
        return this.bookingID + "," + this.dayBook
                + "," + this.checkInDay + "," + this.checkOutDay
                + "," + this.customerId + "," + this.serviceId;
    }

    private Booking() {
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDate getDayBook() {
        return dayBook;
    }

    public void setDayBook(LocalDate dayBook) {
        this.dayBook = dayBook;
    }

    public LocalDate getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(LocalDate checkInDay) {
        this.checkInDay = checkInDay;
    }

    public LocalDate getCheckOutDay() {
        return checkOutDay;
    }

    public void setCheckOutDay(LocalDate checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Booking: " + bookingID + "\n" +
                "Day book: " + dayBook + "\n" +
                "Check-in: " + checkInDay + "\n" +
                "Check-out: " + checkOutDay + "\n" +
                "Customer ID: " + customerId + "\n" +
                "Service ID: " + serviceId;
    }

    @Override
    public int compareTo(Booking o) {
        int cmp = dayBook.getMonth().compareTo(o.getDayBook().getMonth());
        if (cmp == 0) {
            cmp = dayBook.getDayOfMonth() - o.getDayBook().getDayOfMonth();
        }
        return cmp;
    }
}
