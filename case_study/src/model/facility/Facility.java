package model.facility;

import java.io.Serializable;

public abstract class Facility implements Serializable, Comparable<Facility> {
    Integer serviceID;
    String serviceName;
    Double availableArea;
    Double rentCost;
    Integer maxSlot;
    String rentType;
    private static final long serialVersionUID = -2122;


    abstract Integer getServiceID();

    abstract void setServiceID(Integer serviceID);

    abstract String getServiceName();

    abstract void setServiceName(String serviceName);

    abstract Double getAvailableArea();

    abstract void setAvailableArea(Double availableArea);

    abstract Double getRentCost();

    abstract void setRentCost(Double rentCost);

    abstract Integer getMaxSlot();

    abstract void setMaxSlot(Integer maxSlot);

    abstract String getRentType();

    abstract void setRentType(String rentType);

    @Override
    public String toString() {
        return "Facility{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", availableArea=" + availableArea +
                ", rentCost=" + rentCost +
                ", maxSlot=" + maxSlot +
                ", rentType='" + rentType + '\'' +
                '}';
    }

}
