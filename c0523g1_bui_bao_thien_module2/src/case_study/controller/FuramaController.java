package case_study.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("---Welcome to Furama Management Menu----");
        do{
            System.out.println("Press 1: Employee Management");
            System.out.println("Press 2: Customer Management");
            System.out.println("Press 3: Facility Management");
            System.out.println("Press 4: Booking Management");
            System.out.println("Press 5: Promotion Management");
            System.out.println("Press 0: Exit");
            try {
                choice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a number value");
            }
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Remove employee");
                    System.out.println("5. Search employee information by name");
                    System.out.println("6. Return main menu");
                    int choice1 = 0;
                    try {
                        choice1 = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please enter a number value");
                    }
                    switch (choice1) {
                        /**/
                    }
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customers");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Remove customers");
                    System.out.println("5. Search customer information by name");
                    System.out.println("6. Return main menu");
                    int choice2 = 0;
                    try {
                        choice2 = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please enter a number value");
                    }
                    switch (choice2) {
                        /**/
                    }
                    break;
                case 3:
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Remove facility");
                    System.out.println("5. Return main menu");
                    int choice3 = 0;
                    try {
                        choice3 = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please enter a number value");
                    }
                    switch (choice3) {
                        /**/
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list of booking");
                    System.out.println("3: Create new contracts");
                    System.out.println("4: Display list of contracts");
                    System.out.println("5: Edit contracts");
                    System.out.println("6. Return main menu");
                    int choice4 = 0;
                    try {
                        choice4 = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please enter a number value");
                    }
                    switch (choice4) {
                        /**/
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return to main menu");
                    int choice5 = 0;
                    try {
                        choice5 = Integer.parseInt(scanner.next());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please enter a number value");
                    }
                    switch (choice5) {
                        /**/
                    }
                    break;
            }
        }
        while (true);
    }
}
