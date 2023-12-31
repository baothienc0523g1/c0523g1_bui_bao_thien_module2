package controller.controller_sub;

import controller.FuramaController;
import service.facility.FacilityService;

import java.util.Scanner;

public class FalicityController {
    private static FuramaController furamaController = new FuramaController();
    private static FacilityService facilityService = new FacilityService();
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
          try {
              System.out.println("Facility Management");
              System.out.println("1. Display list facility");
              System.out.println("2. Add new facility");
              System.out.println("3. Display list facility maintenance");
              System.out.println("4. Remove facility");
              System.out.println("5. Return to main menu");
              int choice3 = Integer.parseInt(scanner.nextLine());
              switch (choice3) {
                  case 1:
                      facilityService.getList();
                      break;
                  case 2:
                      facilityService.add();
                      break;
                  case 3:
                      facilityService.getMaintenanceList();
                      break;
                  case 4:
                      facilityService.delete();
                      break;
                  case 5:
                      furamaController.display();
                      break;
                  default:
                      System.out.println("Invalid value");
                      this.displayMainMenu();
                      break;
              }
          } catch (NumberFormatException e) {
              System.out.println("Enter a number key");
          }
        } while (true);
    }
}
