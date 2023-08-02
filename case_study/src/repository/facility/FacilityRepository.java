package repository.facility;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import utilities.ReadAndWrite;

import java.time.LocalDate;
import java.util.*;

public class FacilityRepository extends ReadAndWrite implements IFacilityRepository {
    private String ROOM_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\room.cvs";
    private String HOUSE_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\house.csv";
    private String VILLA_PATH = "D:\\GIT - Bai tap\\case_study\\src\\data\\villa.csv";


    private List<Villa> villaArrayList = getVillaList();
    private List<House> houseArrayList = getHouseList();
    private List<Room> roomArrayList = getRoomList();
    @Override
    public Map<Facility, Integer> getList() {
        Map<Facility, Integer> facilities = new LinkedHashMap<>();

        for (Villa villa : getVillaList()) {
            facilities.put(villa, 1);
        }
        for (House house : getHouseList()) {
            facilities.put(house, 1);
        }
        for (Room room : getRoomList()) {
            facilities.put(room, 1);
        }
        return facilities;
    }
    @Override
    public void add(Facility facility) {
        if (facility instanceof Villa) {
            addVilla((Villa) facility);
        } else if (facility instanceof House) {
            addHouse((House) facility);
        } else if (facility instanceof Room) {
            addRoom((Room) facility);
        }
    }

    public void addVilla(Villa villa) {
        villaArrayList.add(villa);
        List<String> villaString = new ArrayList<>();
        villaString.add(villa.toStringForSave());
        myWriteToCSV(villaString, VILLA_PATH, true);
    }

    public void addRoom(Room room) {
        roomArrayList.add(room);
        List<String> roomString = new ArrayList<>();
        roomString.add(room.toStringForSave());
        myWriteToCSV(roomString, ROOM_PATH, true);
    }

    public void addHouse(House house) {
        houseArrayList.add(house);
        List<String> houseString = new ArrayList<>();
        houseString.add(house.toStringForSave());
        myWriteToCSV(houseString, HOUSE_PATH, true);
    }

    private int idTypeCheck(String id) {
        int idType = 0;
        if (id.toLowerCase().contains("svvl")) {
            idType = 3;
        }
        if ((id.toLowerCase().contains("svho"))) {
            idType = 2;
        }
        if (id.toLowerCase().contains("svro")) {
            idType = 1;
        }
        return idType;
    }

    @Override
    public void delete(String id) {
        if (idTypeCheck(id) == 3) {
            for (int i = 0; i < villaArrayList.size(); i++) {
                Villa temp = villaArrayList.get(i);
                if (temp.getServiceID().equals(id)) {
                    villaArrayList.remove(temp);
                }
            }
            writeVillaToCSV(villaArrayList);
        }
        if (idTypeCheck(id) == 2) {
            for (int i = 0; i < houseArrayList.size(); i++) {
                House temp = houseArrayList.get(i);
                if (temp.getServiceID().equals(id)) {
                    houseArrayList.remove(temp);
                }
            }
            writeHouseToCSV(houseArrayList);
        } else {
            for (int i = 0; i < roomArrayList.size(); i++) {
                Room temp = roomArrayList.get(i);
                if (temp.getServiceID().equals(id)) {
                    roomArrayList.remove(temp);
                }
            }
            writeRoomToCSV(roomArrayList);
        }
    }


    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        List<String> houseStringList = myReadFromCSV(HOUSE_PATH);
        String[] pointer = null;

        for (String s : houseStringList) {
            pointer = s.split(",");
            House house = new House(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6], Integer.parseInt(pointer[7]));
            houseList.add(house);
        }
        return houseList;
    }

    public List<Room> getRoomList() {
        List<Room> roomList = new ArrayList<>();
        List<String> roomStringList = myReadFromCSV(ROOM_PATH);
        String[] pointer = null;

        for (String s : roomStringList) {
            pointer = s.split(",");
            Room room = new Room(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public List<Villa> getVillaList() {
        List<Villa> villas = new ArrayList<>();
        List<String> villaStringList = myReadFromCSV(VILLA_PATH);
        String[] pointer = null;

        for (String s : villaStringList) {
            pointer = s.split(",");
            Villa villa = new Villa(pointer[0], (pointer[1]), Double.parseDouble(pointer[2]),
                    Double.parseDouble(pointer[3]), Integer.parseInt(pointer[4]),
                    pointer[5], pointer[6], Double.parseDouble(pointer[7]), Integer.parseInt(pointer[8]));
            villas.add(villa);
        }
        return villas;
    }

    private void writeVillaToCSV(List<Villa> villas) {
        List<String> villaString = new ArrayList<>();
        for (int j = 0; j < villas.size(); j++) {
            Villa villa = villas.get(j);
            villaString.add(villa.toStringForSave());
        }
        myWriteToCSV(villaString, VILLA_PATH, false);
    }

    private void writeHouseToCSV(List<House> houses) {
        List<String> houseString = new ArrayList<>();
        for (int j = 0; j < houses.size(); j++) {
            House house = houses.get(j);
            houseString.add(house.toStringForSave());
        }
        myWriteToCSV(houseString, HOUSE_PATH, false);
    }

    private void writeRoomToCSV(List<Room> rooms) {
        List<String> roomString = new ArrayList<>();
        for (int j = 0; j < rooms.size(); j++) {
            Room room = rooms.get(j);
            roomString.add(room.toStringForSave());
        }
        myWriteToCSV(roomString, ROOM_PATH, false);
    }

    @Override
    public List<String> getMaintenanceList() {
        return null;
    }
    public List<Facility> getFacilityForSearch() {
        List<Facility> facilities = new ArrayList<>();
        for (Villa villa : getVillaList()) {
            facilities.add(villa);
        }
        for (House house : getHouseList()) {
            facilities.add(house);
        }
        for (Room room : getRoomList()) {
            facilities.add(room);
        }
        return facilities;
    }
}
