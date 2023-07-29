package controller;

import controller.sub_controller.*;

import java.util.Scanner;

public class FuramaController {
    private static BookingController bookingController = new BookingController();
    private static CustomerController customerController = new CustomerController();
    private static EmployeeController employeeController = new EmployeeController();
    private static PromotionController promotionController = new PromotionController();
    private static FalicityController falicityController = new FalicityController();
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            try {
                if (choice == -1) {
                    System.out.println("----FURAMA CENTER MANAGER----");
                    System.out.println("Press 1. Employee Management");
                    System.out.println("Press 2. Customer Management");
                    System.out.println("Press 3. Facility Management");
                    System.out.println("Press 4. Booking Management");
                    System.out.println("Press 5. Promotion Management");
                    System.out.println("Press 6. Exit");

                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            employeeController.displayMainMenu();
                            break;
                        case 2:
                            customerController.displayMainMenu();
                            break;
                        case 3:
                            falicityController.displayMainMenu();
                            break;
                        case 4:
                            bookingController.displayMainMenu();
                            break;
                        case 5:
                            promotionController.displayMainMenu();
                        case 6:
                            System.out.println("Stopped");
                            System.exit(0);
                        default:
                            System.out.println("Invalid key");
                            this.display();
                            break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number key");
            }
        } while (true);
    }
}
