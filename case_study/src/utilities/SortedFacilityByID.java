package utilities;

import model.facility.Facility;

import java.util.Comparator;

public class SortedFacilityByID implements Comparator<Facility> {
    @Override
    public int compare(Facility o1, Facility o2) {
        return o1.getServiceID().compareTo(o2.getServiceID());
    }
}
