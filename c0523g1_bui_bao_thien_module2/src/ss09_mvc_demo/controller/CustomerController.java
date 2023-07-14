package ss09_1_mvc.controller;

import ss09_1_mvc.model.Customer;
import ss09_1_mvc.repo.CustomerRepository;
import ss09_1_mvc.service.CustomerService;
import ss09_1_mvc.service.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerService();

    /*có thể code ở package view, sau đó gọi về controller*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            if (choice == 0) {
                System.exit(0);
            } else {
                System.out.println("-----Customer Manager-----");
                System.out.println("1: Show list");
                System.out.println("2: Create new customer");
                System.out.println("3: Remove customer from list");
                System.out.println("4: Checking customer from list");
                System.out.println("0: Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:

                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
                }

            }
        }
        while (choice != 0);

    }
}