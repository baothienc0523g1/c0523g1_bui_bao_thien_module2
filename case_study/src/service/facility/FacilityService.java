package service.facility;

import controller.controller_sub.FalicityController;
import model.facility.Facility;
import model.facility.Villa;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;
import service.facility.facility_sub.AddHouse;
import service.facility.facility_sub.AddRoom;
import service.facility.facility_sub.AddVilla;
import utilities.MyRegex;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class FacilityService extends MyRegex implements IFacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
    private FalicityController falicityController = new FalicityController();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getList() {
        Map<Facility, Integer> facilities = facilityRepository.getList();
        for (Map.Entry<Facility, Integer> facility : facilities.entrySet()) {
            System.out.println(facility.getKey() + ", used: " + facility.getValue() + " times.");
            System.out.println("");
        }
    }

    @Override
    public void add() {
        Integer choice;
        System.out.println("Enter which facility need to add");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                falicityController.displayMainMenu();
                break;
            default:
                System.out.println("Invalid value bro");
        }
    }

    protected boolean idCheck(String id) {
        boolean flag = true;
        for (Facility facility : facilityRepository.getFacilityForSearch()) {
            if (facility.getServiceID().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void addVilla() {
        System.out.println("New villa");
        AddVilla addVilla = new AddVilla();
        addVilla.addVilla();
    }

    public void addHouse() {
        System.out.println("New house");
        AddHouse addHouse = new AddHouse();
        addHouse.addHouse();
    }

    public void addRoom() {
        System.out.println("New room");
        AddRoom addRoom = new AddRoom();
        addRoom.addRoom();
    }


    @Override
    public void getMaintenanceList() {

    }

    @Override
    public void delete() {
        System.out.println("Enter service ID");
        String serviceID = scanner.nextLine();

        if (!idCheck(serviceID)) {
            facilityRepository.delete(serviceID);
            System.out.println("Facility with id: " + serviceID + " is removed!");
        } else {
            System.out.println("There is no facility with id: " + serviceID);
        }
    }
}
