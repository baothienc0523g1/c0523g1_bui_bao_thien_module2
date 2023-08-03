package model.facility;

public class Room extends Facility {

    private String freeServiceGift;


    public Room(String serviceID, String serviceName, Double availableArea,
                Double rentCost, Integer maxSlot, String rentType,
                String freeServiceGift) {
        super(serviceID, serviceName, availableArea, rentCost, maxSlot, rentType);
        this.freeServiceGift = freeServiceGift;
    }

    @Override
    public String toStringForSave() {
        return this.serviceID + "," + this.serviceName + "," + this.availableArea + ","
                + this.rentCost + "," + this.maxSlot + "," +
                this.rentType + "," + this.freeServiceGift;
    }

    @Override
    public String getServiceID() {
        return serviceID;
    }

    @Override
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public Double getAvailableArea() {
        return availableArea;
    }

    @Override
    public void setAvailableArea(Double availableArea) {
        this.availableArea = availableArea;
    }

    @Override
    public Double getRentCost() {
        return rentCost;
    }

    @Override
    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }

    @Override
    public Integer getMaxSlot() {
        return maxSlot;
    }

    @Override
    public void setMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
    }

    @Override
    public String getRentType() {
        return rentType;
    }

    @Override
    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getFreeServiceGift() {
        return freeServiceGift;
    }

    public void setFreeServiceGift(String freeServiceGift) {
        this.freeServiceGift = freeServiceGift;
    }

    @Override
    public String toString() {
        return "Room: " +
                "service ID: " + serviceID +
                ", service name: " + serviceName +
                ", available area: " + availableArea + " m2" +
                ", rent cost: $" + rentCost + " / 3 days" +
                ", max slot: " + maxSlot +
                ", rent type: " + rentType +
                ", free service gift: " + freeServiceGift;
    }

    @Override
    public int compareTo(Facility o) {
        return (int) (this.getAvailableArea() - o.getAvailableArea());
    }

    @Override
    public String getType() {
        return "Room";
    }
}
