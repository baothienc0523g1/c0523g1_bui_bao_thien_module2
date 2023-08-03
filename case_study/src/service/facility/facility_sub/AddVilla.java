package service.facility.facility_sub;

import model.facility.Villa;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;
import service.facility.FacilityService;

import java.util.Scanner;

public class AddVilla extends FacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
    public void addVilla() {
        Scanner scanner = new Scanner(System.in);

        String serviceID;
        System.out.println("Enter service ID");
        do {
            serviceID = scanner.nextLine();
            if (!idCheck(serviceID)) {
                System.out.println("ID " + serviceID + " already exist, try again");
            } else if (!myRegex(serviceID, VILLA_SERVICE_ID)) {
                System.out.println("Service ID: SVVL-NNNN. With N is a number");
            }
        } while (!myRegex(serviceID, VILLA_SERVICE_ID) || !idCheck(serviceID));

        System.out.println("Enter service name");
        String serviceName;
        do {
            serviceName = scanner.nextLine();
            if (!myRegex(serviceName, FACILITY_SERVICE_NAME)) {
                System.out.println("Service name start with a upper letter");
            }
        } while (!myRegex(serviceName, FACILITY_SERVICE_NAME));

        System.out.println("Enter available area of villa");
        Double availableArea;
        do {
            availableArea = Double.parseDouble(scanner.nextLine());
            if (availableArea < 100) {
                System.out.println("Sorry, we dont have any room smaller than 100m2");
            }
        }  while (availableArea < 100);

        System.out.println("Enter rent cost for 3 days");
        Double rentCost;
        do {
            rentCost = Double.parseDouble(scanner.nextLine());
            if (rentCost < 1) {
                System.out.println("Rent cost cant be: " + rentCost);
            }
        } while (rentCost < 1);

        System.out.println("Max slot of villa");
        Integer maxSlot;
        do {
            maxSlot = Integer.parseInt(scanner.nextLine());
            if (maxSlot > 20 || maxSlot < 0) {
                System.out.println("Max slot should be 1 to 20 person(s)");
            }
        } while (maxSlot > 20 || maxSlot < 0);

        System.out.println("Type of rent for this villa");
        String renType;
        do {
            renType = scanner.nextLine();
            if (!renType.equals(serviceID)) {
                System.out.println("Rent type can't be difference with service ID");
            }
        } while (!renType.equals(serviceID));

        System.out.println("Description: ");
        String description = scanner.nextLine();

        System.out.println("Pool area");
        Double poolArea;
        do {
            poolArea = Double.parseDouble(scanner.nextLine());
            if (poolArea <= 30) {
                System.out.println("Pool area can't be like that bruh, it's must be greater than 30m2");
            }
        } while (poolArea <= 30);

        System.out.println("Villa's number of floor");
        Integer floors;
        do {
            floors = Integer.parseInt(scanner.nextLine());
            if (floors < 0 || floors > 15) {
                System.out.println("Flor is a number between 1 to 15");
            }
        } while (floors < 0 || floors > 15);

        Villa villa = new Villa(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, description, poolArea, floors);
        facilityRepository.addVilla(villa);
        System.out.println("Villa with id: " + serviceID + " successfully added to list");
    }

}
