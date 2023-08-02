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
        String serviceName = scanner.nextLine();
        System.out.println("Enter available area of villa");
        Double availableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rent cost for 3 days");
        Double rentCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Max slot of villa");
        Integer maxSlot = Integer.parseInt(scanner.nextLine());
        System.out.println("Type of rent for this villa");
        String renType = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Pool area");
        Double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Villa's number of floor");
        Integer floors = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(serviceID, serviceName, availableArea, rentCost,
                maxSlot, renType, description, poolArea, floors);
        facilityRepository.addVilla(villa);
        System.out.println("Villa with id: " + serviceID + " successfully added to list");
    }

}
