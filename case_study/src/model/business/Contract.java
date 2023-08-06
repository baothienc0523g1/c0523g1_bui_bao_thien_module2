package model.business;

import java.io.Serializable;
import java.time.LocalDate;

public class Contract implements Serializable, Comparable<Contract> {
    private LocalDate dayBook;
    private LocalDate checkInDay;
    private LocalDate checkOutDay;
    private String customerId;
    private String serviceId;
    private String contractID;
    private String bookingID;
    private Double deposit;
    private Double totalCost;
    private static final long serialVersionUID = -231291;

    public Contract(LocalDate dayBook, LocalDate checkInDay, LocalDate checkOutDay,
                    String customerId, String serviceId, String contractID,
                    String bookingID, Double deposit, Double totalCost) {
        this.dayBook = dayBook;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.totalCost = totalCost;
    }

    public Contract(LocalDate dayBook, LocalDate checkInDay, LocalDate checkOutDay,
                    String serviceId, Double deposit, Double totalCost) {
        this.dayBook = dayBook;
        this.checkInDay = checkInDay;
        this.checkOutDay = checkOutDay;
        this.serviceId = serviceId;
        this.deposit = deposit;
        this.totalCost = totalCost;
    }

    public String toStringForSave() {
        return this.dayBook + "," +
                this.checkInDay + "," +
                this.checkOutDay + "," +
                this.customerId + "," +
                this.serviceId + "," +
                this.contractID + "," +
                this.bookingID + "," +
                this.deposit + "," +
                this.totalCost;
    }

    public Contract() {
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
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
        return "Contract: " + contractID + "\n" +
                "booking ID: " + bookingID + "\n" +
                "day book: " + dayBook + "\n" +
                "check-in: " + checkInDay + "\n" +
                "check-out: " + checkOutDay + "\n" +
                "customer id: " + customerId + "\n" +
                "service id: " + serviceId + "\n" +
                "deposit: $" + deposit + "\n" +
                "total cost: $" + totalCost;
    }

    @Override
    public int compareTo(Contract o) {
        int cmp = dayBook.getMonth().compareTo(o.getDayBook().getMonth());
        if (cmp == 0) {
            cmp = dayBook.getDayOfMonth() - o.getDayBook().getDayOfMonth();
        } else if (cmp == 0) {
            cmp = checkOutDay.getDayOfMonth() - o.checkOutDay.getDayOfMonth();
        }
        return cmp;
    }
}
