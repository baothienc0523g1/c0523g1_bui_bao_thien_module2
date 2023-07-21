package case_study.model.facility;

public class Room extends Facility {
    private int serviceID;
    private String serviceName;
    private double areaUse;
    private int cost;
    private int maxCapacityOfRent;
    private String typeOfRent;
    private String freeServiceGift;

    public Room() {
    }

    public Room(int serviceID, String serviceName, double areaUse,
                int cost, int maxCapacityOfRent, String typeOfRent,
                String freeServiceGift) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.cost = cost;
        this.maxCapacityOfRent = maxCapacityOfRent;
        this.typeOfRent = typeOfRent;
        this.freeServiceGift = freeServiceGift;
    }

    @Override
    public int getServiceID() {
        return serviceID;
    }

    @Override
    public void setServiceID(int serviceID) {
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
    public double getAreaUse() {
        return areaUse;
    }

    @Override
    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getMaxCapacityOfRent() {
        return maxCapacityOfRent;
    }

    @Override
    public void setMaxCapacityOfRent(int maxCapacityOfRent) {
        this.maxCapacityOfRent = maxCapacityOfRent;
    }

    @Override
    public String getTypeOfRent() {
        return typeOfRent;
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public String getFreeServiceGift() {
        return freeServiceGift;
    }

    public void setFreeServiceGift(String freeServiceGift) {
        this.freeServiceGift = freeServiceGift;
    }
}
