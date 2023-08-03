package model.facility;

public class Villa extends Facility {
    private String roomDescription;
    private Double poolArea;
    private Integer floors;


    public Villa(String serviceID, String serviceName, Double availableArea,
                 Double rentCost, Integer maxSlot, String rentType,
                 String roomDescription, Double poolArea, Integer floors) {
        super(serviceID, serviceName, availableArea, rentCost, maxSlot, rentType);
        this.roomDescription = roomDescription;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String toStringForSave() {
        return this.serviceID + "," + this.serviceName + "," + this.availableArea
                + "," + this.rentCost + "," + this.maxSlot + ","
                + this.rentType + "," + this.roomDescription + ","
                + this.poolArea + "," + this.floors;
    }

    @Override
    public String toString() {
        return "Villa: " +
                "service ID: " + serviceID +
                ", service name: " + serviceName +
                ", available area: " + availableArea + " m2" +
                ", rent cost: $" + rentCost + "/ 3 days" +
                ", max slot: " + maxSlot +
                ", rent type: " + rentType +
                ", room description: " + roomDescription +
                ", pool area: " + poolArea + " m2" +
                ", floors: " + floors;
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

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @Override
    public int compareTo(Facility o) {
        return (int) (this.getAvailableArea() - o.getAvailableArea());
    }

    @Override
    public String getType() {
        return "Villa";
    }
}
