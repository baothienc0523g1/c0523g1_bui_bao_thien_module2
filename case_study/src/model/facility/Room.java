package model.facility;

public class Room extends Facility  {
    private Integer serviceID;
    private String serviceName;
    private Double availableArea;
    private Double rentCost;
    private Integer maxSlot;
    private String rentType;
    private String freeServiceGift;

    public Room() {
    }

    public Room(Integer serviceID, String serviceName, Double availableArea,
                Double rentCost, Integer maxSlot, String rentType, String freeServiceGift) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.availableArea = availableArea;
        this.rentCost = rentCost;
        this.maxSlot = maxSlot;
        this.rentType = rentType;
        this.freeServiceGift = freeServiceGift;
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

    public String getFreeServiceGift() {
        return freeServiceGift;
    }

    public void setFreeServiceGift(String freeServiceGift) {
        this.freeServiceGift = freeServiceGift;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", availableArea=" + availableArea +
                ", rentCost=" + rentCost +
                ", maxSlot=" + maxSlot +
                ", rentType='" + rentType + '\'' +
                ", freeServiceGift='" + freeServiceGift + '\'' +
                '}';
    }

    @Override
    public int compareTo(Facility o) {
        return this.getServiceID() - o.getServiceID();
    }
}
