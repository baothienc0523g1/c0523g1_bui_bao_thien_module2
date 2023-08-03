package service.facility.facility_sub;

import model.facility.House;
import model.facility.Room;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;
import service.facility.FacilityService;

import java.util.Scanner;

public class AddRoom extends FacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
    public void addRoom() {
        Scanner scanner = new Scanner(System.in);

        String serviceID;
        System.out.println("Enter service ID");
        do {
            serviceID = scanner.nextLine();
            if (!idCheck(serviceID)) {
                System.out.println("ID " + serviceID + " already exist, try again");
            } else if (!myRegex(serviceID, ROOM_SERVICE_ID)) {
                System.out.println("Service ID: SVRO-NNNN. With N is a number");
            }
        } while (!myRegex(serviceID, ROOM_SERVICE_ID) || !idCheck(serviceID));

        System.out.println("Enter service name");
        String serviceName;
        do {
             serviceName = scanner.nextLine();
             if (!myRegex(serviceName, FACILITY_SERVICE_NAME)) {
                 System.out.println("Service name start with a upper letter");
             }
        } while (!myRegex(serviceName, FACILITY_SERVICE_NAME));

        System.out.println("Enter available area of room");
        Double availableArea;
        do {
            availableArea = Double.parseDouble(scanner.nextLine());
            if (availableArea < 30) {
                System.out.println("Sorry, we dont have any room smaller than 30m2");
            }
        } while (availableArea < 30);

        System.out.println("Enter rent cost for 3 days");
        Double rentCost;
        do {
            rentCost = Double.parseDouble(scanner.nextLine());
            if (rentCost < 1) {
                System.out.println("Rent cost cant be: " + rentCost);
            }
        } while (rentCost < 1);

        System.out.println("Max slot of room");
        Integer maxSlot;
        do {
            maxSlot = Integer.parseInt(scanner.nextLine());
            if (maxSlot > 20 || maxSlot < 0) {
                System.out.println("Max slot should be 1 to 20 person(s)");
            }
        } while (maxSlot > 20 || maxSlot < 0);

        System.out.println("Type of rent for this room");
        String renType;
        do {
             renType = scanner.nextLine();
             if (!renType.equals(serviceID)) {
                 System.out.println("Rent type can't be difference with service ID");
             }
        } while (!renType.equals(serviceID));

        System.out.println("Free service gift: ");
        String freeServiceGift = scanner.nextLine();

        Room room = new Room(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, freeServiceGift);
        facilityRepository.addRoom(room);
        System.out.println("Room with id: " + serviceID + " successfully added to list");
    }
}
