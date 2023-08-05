package service.facility.facility_sub;

import model.facility.House;
import model.facility.Villa;
import repository.facility.FacilityRepository;
import repository.facility.IFacilityRepository;
import service.facility.FacilityService;

import java.util.Scanner;

public class AddHouse extends FacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();
    public void addHouse() {
        Scanner scanner = new Scanner(System.in);

        String serviceID;
        System.out.println("Enter service ID");
        do {
            serviceID = scanner.nextLine();
            if (!idCheck(serviceID)) {
                System.out.println("ID " + serviceID + " already exist, try again");
            } else if (!myRegex(serviceID, HOUSE_SERVICE_ID)) {
                System.out.println("Service ID: SVHO-NNNN. With N is a number");
            }
        } while (!myRegex(serviceID, HOUSE_SERVICE_ID) || !idCheck(serviceID));

        System.out.println("Enter service name");
        String serviceName;
        do {
             serviceName = scanner.nextLine();
            if (!myRegex(serviceName, FACILITY_SERVICE_NAME)) {
                System.out.println("Service name start with a upper letter");
            }
        } while (!myRegex(serviceName, FACILITY_SERVICE_NAME));

        System.out.println("Enter available area of house");
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

        System.out.println("Max slot of house");
        Integer maxSlot;
        do {
            maxSlot = Integer.parseInt(scanner.nextLine());
            if (maxSlot > 20 || maxSlot < 0) {
                System.out.println("Max slot should be 1 to 20 person(s)");
            }
        } while (maxSlot > 20 || maxSlot < 0);

        System.out.println("Type of rent for this house");
        String renType;
        do {
            renType = scanner.nextLine();
            if (!myRegex(renType, FACILITY_SERVICE_NAME)) {
                System.out.println("Rent type can't be difference with service ID");
            }
        } while (!myRegex(renType, FACILITY_SERVICE_NAME));

        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("House's number of floor");
        Integer floors;
        do {
            floors = Integer.parseInt(scanner.nextLine());
            if (floors < 1 || floors > 15) {
                System.out.println("Flor is a number between 1 to 15");
            }
        } while (floors < 1 || floors > 15);

        House house = new House(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, description, floors);
        facilityRepository.addHouse(house);
        System.out.println("House with id: " + serviceID + " successfully added to list");
    }
}
