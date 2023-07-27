package controller.sub_controller;

import controller.FuramaController;

import java.util.Scanner;

public class CustomerController {
    private static FuramaController furamaController = new FuramaController();
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Customer Management");
                System.out.println("1. Display list customer");
                System.out.println("2. Add new customer");
                System.out.println("3. Edit customer");
                System.out.println("4. Remove customer");
                System.out.println("5. Search a customer with name");
                System.out.println("6. Return to main menu");
                int choice2 = Integer.parseInt(scanner.nextLine());
                switch (choice2) {
                    case 6:
                        furamaController.display();
                        break;
                    default:
                        System.out.println("Invalid key");
                        this.displayMainMenu();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number key");
            }
        } while (true);
    }
}
