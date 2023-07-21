package case_study.model.facility;

public abstract class Facility {
    private int serviceID;
    private String serviceName;
    private double areaUse;
    private int cost;
    private int maxCapacityOfRent;
    private String typeOfRent;

    public abstract int getServiceID();

    public abstract void setServiceID(int serviceID);

    public abstract String getServiceName();

    public abstract void setServiceName(String serviceName);

    public abstract double getAreaUse();

    public abstract void setAreaUse(double areaUse);

    public abstract int getCost();

    public abstract void setCost(int cost);

    public abstract int getMaxCapacityOfRent();

    public abstract void setMaxCapacityOfRent(int maxCapacityOfRent);

    public abstract String getTypeOfRent();

    public abstract void setTypeOfRent(String typeOfRent);
}
