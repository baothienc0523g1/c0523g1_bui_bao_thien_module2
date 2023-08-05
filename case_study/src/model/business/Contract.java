package model.business;

import java.io.Serializable;

public class Contract implements Serializable {
    private String contractID;
    private String bookingID;
    private Double deposit;
    private Double totalCost;
    private static final long serialVersionUID = -231291;


    public Contract(String contractID, String bookingID, Double deposit, Double totalCost) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.totalCost = totalCost;
    }
    public String toStringForSave() {
        return this.contractID + "," + this.bookingID
                + "," + this.deposit + "," + this.totalCost;
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

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", deposit=" + deposit +
                ", totalCost=" + totalCost +
                '}';
    }
}
