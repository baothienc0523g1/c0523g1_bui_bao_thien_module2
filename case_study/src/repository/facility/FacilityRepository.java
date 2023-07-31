package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import utilities.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository extends ReadAndWrite implements IFacilityRepository {
    private String ROOM_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\room.csv";
    private String HOUSE_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\house.csv";
    private String VILLA_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\villa.csv";

    private Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    {
        Room room1 = new Room("SVRO-0001", "Phong vip", 30.0, 50.0, 4, "SVRO-0001", "Giường đơn cho người có đôi ");
        Room room2 = new Room("SVRO-0002", "Phong hoi vip", 30.0, 50.0, 4, "SVRO-0002", "Giường đôi cho người cô đơn");
        House house1 = new House("SVHO-0001", "Home stay", 100.0, 500.0, 4, "SVHO-0001", "Hòa mình với thiên nhiên", 2);
        House house2 = new House("SVHO-0002", "Home stay", 100.0, 500.0, 4, "SVHO-0002", "Ngôi nhà thứ 2 của pạn", 2);
        Villa villa1 = new Villa("SVVL0001", "Penthouse", 500.0, 3500.0, 20, "SVVL-0001", "Thiên đường nghỉ dưỡng", 50.0, 4);
        Villa villa2 = new Villa("SVVL0002", "Penthouse", 600.0, 4000.0, 20, "SVVL-0002", "Thiên đường nghỉ dưỡng", 60.0, 5);
        facilityMap.put(room1, 2);
        facilityMap.put(room2, 2);
        facilityMap.put(house1, 2);
        facilityMap.put(house2, 2);
        facilityMap.put(villa1, 2);
        facilityMap.put(villa2, 2);
    }

    @Override
    public List<Facility> getList() {
        List<Facility> result = new ArrayList<>();

        result.addAll(getRoomList());
        result.addAll(getHouseList());
        result.addAll(getVillaList());
        return result;
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<String> getMaintenanceList() {
        return null;
    }


    private List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        List<String> houseStringList = myReadFromCSV(HOUSE_PATH);
        String[] pointer = null;

        for (String s : houseStringList) {
            pointer = s.split(",");
            House house = new House(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6], Integer.parseInt(pointer[7]));
        }
        return houseList;
    }

    private List<Room> getRoomList() {
        List<Room> roomList = new ArrayList<>();
        List<String> roomStringList = myReadFromCSV(ROOM_PATH);
        String[] pointer = null;

        for (String s : roomStringList) {
            pointer = s.split(",");
            Room room = new Room(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6]);
        }
        return roomList;
    }

    private List<Villa> getVillaList() {
        List<Villa> villas = new ArrayList<>();
        List<String> villaStringList = myReadFromCSV(HOUSE_PATH);
        String[] pointer = null;

        for (String s : villaStringList) {
            pointer = s.split(",");
            Villa villa = new Villa(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6], Double.parseDouble(pointer[7]), Integer.parseInt(pointer[8]));
        }
        return villas;
    }
}
