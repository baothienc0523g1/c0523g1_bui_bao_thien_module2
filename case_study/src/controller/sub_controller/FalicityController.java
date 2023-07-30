package controller.sub_controller;

import controller.FuramaController;

import java.util.Scanner;

public class FalicityController {
    private static FuramaController furamaController = new FuramaController();
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
                  case 2:
                      System.out.println("Add new facility");
                      System.out.println("1. Add new Villa");
                      System.out.println("2. Add new House");
                      System.out.println("3. Add new Room");
                      System.out.println("4. Back to menu");
                      int choiceCase2 = Integer.parseInt(scanner.nextLine());
                      switch (choiceCase2) {
                          case 4:
                              displayMainMenu();
                              break;
                      }
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
