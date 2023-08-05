package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IRepository;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    List<String> getVillaIdList();
    List<String> getHouseIdList();
    List<String> getRoomIdList();
    Map<Facility, Integer> getList();

    List<String> getMaintenanceList();

    void add(Facility facility);

    void addVilla(Villa villa);

    void addHouse(House house);

    void addRoom(Room room);

    List<Villa> getVillaList();

    List<House> getHouseList();

    List<Room> getRoomList();

    List<Facility> getFacilityForSearch();

    void delete(String id);

}
