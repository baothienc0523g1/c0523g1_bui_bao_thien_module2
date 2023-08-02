package controller.controller_sub;

import controller.FuramaController;

import java.util.Scanner;

public class PromotionController {
    private static FuramaController furamaController = new FuramaController();
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Promotion Management");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return to main menu");
            int choice5 = Integer.parseInt(scanner.nextLine());
            switch (choice5) {
                case 3:
                    furamaController.display();
                    break;
                default:
                    System.out.println("Invalid value");
                    this.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
