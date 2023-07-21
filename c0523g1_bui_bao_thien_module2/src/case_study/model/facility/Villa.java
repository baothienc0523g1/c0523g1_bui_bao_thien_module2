package case_study.model.facility;

public class Villa extends Facility {
    private int serviceID;
    private String serviceName;
    private double areaUse;
    private int cost;
    private int maxCapacityOfRent;
    private String typeOfRent;
    private int typeOfRoom;
    private double sizeOfPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(int serviceID, String serviceName, double areaUse, int cost,
                 int maxCapacityOfRent, String typeOfRent, int typeOfRoom,
                 double sizeOfPool, int numberOfFloors) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.cost = cost;
        this.maxCapacityOfRent = maxCapacityOfRent;
        this.typeOfRent = typeOfRent;
        this.typeOfRoom = typeOfRoom;
        this.sizeOfPool = sizeOfPool;
        this.numberOfFloors = numberOfFloors;
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

    public int getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(int typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getSizeOfPool() {
        return sizeOfPool;
    }

    public void setSizeOfPool(double sizeOfPool) {
        this.sizeOfPool = sizeOfPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
