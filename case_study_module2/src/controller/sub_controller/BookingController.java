package controller.sub_controller;

import controller.FuramaController;

import java.util.Scanner;

public class BookingController {
    private static FuramaController furamaController = new FuramaController();
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Booking Management");
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new contract");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contract");
                System.out.println("6. Return to main menu");
                int choice4 = Integer.parseInt(scanner.nextLine());
                switch (choice4) {
                    case 6:
                        furamaController.display();
                        break;
                    default:
                        System.out.println("Invalid key");
                        this.displayMainMenu();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number key");
            }
        } while (true);
    }
}
