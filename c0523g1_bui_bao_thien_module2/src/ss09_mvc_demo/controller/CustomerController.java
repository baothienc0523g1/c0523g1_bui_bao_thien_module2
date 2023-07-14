package ss09_mvc_demo.controller;

import ss09_mvc_demo.model.Customer;
import ss09_mvc_demo.service.CustomerService;
import ss09_mvc_demo.service.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerService();

    /*có thể code ở package view, sau đó gọi về controller*/
    /*các biến fix dùng để khắc phục tình trạng bị trôi lệnh khi gọi scanner*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
                System.out.println("-----Customer Manager-----");
                System.out.println("1: Show list");
                System.out.println("2: Create new customer");
                System.out.println("3: Remove customer from list");
                System.out.println("4: Checking customer from list");
                System.out.println("0: Exit");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        service.getList();
                        break;
                    case 2:
                        System.out.println("Insert ID: ");
                        int id = input.nextInt();

                        System.out.println("Insert name: ");
                        String name = input.next();

                        System.out.println("Insert age: ");
                        int age = input.nextInt();

                        System.out.println("Insert customer type: ");
                        String customerType = input.next();

                        Customer newCustomer = new Customer(id, name, age, customerType);
                        service.add(newCustomer);
                        break;
                    case 3:
                        System.out.println("Enter an ID your want to remove from system");
                        service.remove(input.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter Customer's name you'd like to search");
                        String stringName = input.next();
                        service.find(stringName);
                        break;
                    case 0:
                        System.exit(0);
                }
            }
        while (true);
    }
}