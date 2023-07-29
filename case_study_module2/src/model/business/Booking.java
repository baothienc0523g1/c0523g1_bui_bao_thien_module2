package model.business;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {
    private String bookingID;
    private LocalDate dayBook;
    private LocalDate checkInDay;
    private LocalDate checkOutDay;
    private String customerId;
    private String serviceId;
    private static final long serialVersionUID = -120345;


    public Booking(String bookingID, LocalDate dayBook,
                   LocalDate dayStart, LocalDate dayEnd,
                   String customerId, String serviceId) {
        this.bookingID = bookingID;
        this.dayBook = dayBook;
        this.checkInDay = dayStart;
        this.checkOutDay = dayEnd;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }
    private Booking() {}

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
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", dayBook=" + dayBook +
                ", dayStart=" + checkInDay +
                ", dayEnd=" + checkOutDay +
                ", customerId='" + customerId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }
}
