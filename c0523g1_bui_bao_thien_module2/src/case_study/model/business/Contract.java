package case_study.model.business;

public class Contract {
    private int id;
    private int bookingCode;
    private int totalCost;
    private int deposit;

    public Contract() {
    }

    public Contract(int id, int bookingCode, int totalCost, int deposit) {
        this.id = id;
        this.bookingCode = bookingCode;
        this.totalCost = totalCost;
        this.deposit = deposit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", bookingCode=" + bookingCode +
                ", totalCost=" + totalCost +
                ", deposit=" + deposit +
                '}';
    }
}
