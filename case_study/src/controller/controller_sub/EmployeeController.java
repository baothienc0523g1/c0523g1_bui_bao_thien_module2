package controller.controller_sub;

import controller.FuramaController;
import service.employee.EmployeeService;
import service.employee.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static FuramaController furamaController = new FuramaController();
    private static IEmployeeService employeeService = new EmployeeService();
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
                    case 1:
                        employeeService.getList();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        employeeService.delete();
                        break;
                    case 5:
                        employeeService.searchByName();
                        break;
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