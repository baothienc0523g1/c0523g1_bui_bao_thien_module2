package repository.facility;

import model.facility.Facility;
import utilities.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;

public class FacilityRepository extends ReadAndWrite implements IFacilityRepository{
    private String ROOM_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\room.csv";
    private String HOUSE_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\house.csv";
    private String VILLA_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\villa.csv";


    @Override
    public List<String> getList() {
        return null;
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public List<String> getMaintenanceList() {
        return null;
    }

    @Override
    public void delete(int serviceID) {

    }
}
