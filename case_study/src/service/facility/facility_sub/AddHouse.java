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
        String serviceName = scanner.nextLine();
        System.out.println("Enter available area of house");
        Double availableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rent cost for 3 days");
        Double rentCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Max slot of house");
        Integer maxSlot = Integer.parseInt(scanner.nextLine());
        System.out.println("Type of rent for this house");
        String renType = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("House's number of floor");
        Integer floors = Integer.parseInt(scanner.nextLine());

        House house = new House(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, description, floors);
        facilityRepository.addHouse(house);
        System.out.println("House with id: " + serviceID + " successfully added to list");
    }
}
