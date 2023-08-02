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
        String serviceName = scanner.nextLine();
        System.out.println("Enter available area of room");
        Double availableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rent cost for 3 days");
        Double rentCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Max slot of room");
        Integer maxSlot = Integer.parseInt(scanner.nextLine());
        System.out.println("Type of rent for this room");
        String renType = scanner.nextLine();
        System.out.println("Description: ");
        String freeServiceGift = scanner.nextLine();

        Room room = new Room(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, freeServiceGift);
        facilityRepository.addRoom(room);
        System.out.println("Room with id: " + serviceID + " successfully added to list");
    }
}
