package service.facility;

import model.facility.Facility;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;

import java.util.List;

public class FacilityService implements IFacilityService{
    private IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void getList() {

    }

    @Override
    public void add() {
        List<Facility> myList = facilityRepository.getList();
        for (Facility facility : myList) {
            System.out.println(facility);
            System.out.println("-----");
        }
    }

    @Override
    public void getMaintenanceList() {

    }

    @Override
    public void delete() {

    }
}
