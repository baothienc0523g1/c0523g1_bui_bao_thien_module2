package model.facility;

import java.io.Serializable;

public abstract class Facility implements Serializable, Comparable<Facility> {
    String serviceID;
    String serviceName;
    Double availableArea;
    Double rentCost;
    Integer maxSlot;
    String rentType;
    private static final long serialVersionUID = -2122;

    public Facility(String serviceID, String serviceName,
                    Double availableArea, Double rentCost,
                    Integer maxSlot, String rentType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.availableArea = availableArea;
        this.rentCost = rentCost;
        this.maxSlot = maxSlot;
        this.rentType = rentType;
    }

    public abstract String getType();
    public abstract String toStringForSave();


    public abstract String getServiceID();

    public abstract void setServiceID(String serviceID);

    public abstract String getServiceName();

    public abstract void setServiceName(String serviceName);

    public abstract Double getAvailableArea();

    public abstract void setAvailableArea(Double availableArea);

    public abstract Double getRentCost();

    public abstract void setRentCost(Double rentCost);

    public abstract Integer getMaxSlot();

    public abstract void setMaxSlot(Integer maxSlot);

    public abstract String getRentType();

    public abstract void setRentType(String rentType);


}
