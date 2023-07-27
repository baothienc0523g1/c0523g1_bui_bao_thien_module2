package controller.sub_controller;

import controller.FuramaController;

import java.util.Scanner;

public class EmployeeController {
    private static FuramaController furamaController = new FuramaController();
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Employee Management");
                System.out.println("1. Display list employee");
                System.out.println("2. Add new employee");
                System.out.println("3. Edit employee");
                System.out.println("4. Remove employee");
                System.out.println("5. Search an employee with name");
                System.out.println("6. Return to main menu");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
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