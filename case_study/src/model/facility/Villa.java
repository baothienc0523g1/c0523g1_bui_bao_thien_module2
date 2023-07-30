package model.facility;

public class Villa extends Facility{
    private Integer serviceID;
    private String serviceName;
    private Double availableArea;
    private Double rentCost;
    private Integer maxSlot;
    private String rentType;
    private String roomDescription;
    private Double poolArea;
    private Integer floors;

    public Villa() {
    }

    public Villa(Integer serviceID, String serviceName, Double availableArea,
                 Double rentCost, Integer maxSlot, String rentType,
                 String roomDescription, Double poolArea, Integer floors) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.availableArea = availableArea;
        this.rentCost = rentCost;
        this.maxSlot = maxSlot;
        this.rentType = rentType;
        this.roomDescription = roomDescription;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", availableArea=" + availableArea +
                ", rentCost=" + rentCost +
                ", maxSlot=" + maxSlot +
                ", rentType='" + rentType + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                '}';
    }

    @Override
    public Integer getServiceID() {
        return serviceID;
    }

    @Override
    public void setServiceID(Integer serviceID) {
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
}