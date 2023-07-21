package case_study.model.business;

public class Booking {
    private int bookingCode;
    private String bookingDay;
    private String startedDay;
    private String endDay;
    private int customerId;
    private int serviceId;

    public Booking() {
    }

    public Booking(int bookingCode, String bookingDay, String startedDay,
                   String endDay, int customerId, int serviceId) {
        this.bookingCode = bookingCode;
        this.bookingDay = bookingDay;
        this.startedDay = startedDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getStartedDay() {
        return startedDay;
    }

    public void setStartedDay(String startedDay) {
        this.startedDay = startedDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

}
