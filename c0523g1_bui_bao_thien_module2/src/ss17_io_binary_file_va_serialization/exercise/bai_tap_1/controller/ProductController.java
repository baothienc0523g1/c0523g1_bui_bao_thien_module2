package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.controller;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.service.IProductServiceSs17;
import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.service.ProductServiceSs17;

import java.util.Scanner;

public class ProductController {
    private static IProductServiceSs17 service = new ProductServiceSs17();
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Product manager");
            System.out.println("1. Show list");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product");
            System.out.println("4. Product information update");
            System.out.println("5. Search a product by name");
            System.out.println("6. Get sorted list by price");
            System.out.println("0. Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Use a number key to select");
            }
            switch (choice) {
                case 1:
                    service.getList();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.remove();
                    break;
                case 4:
                    service.adjustment();
                    break;
                case 5:
                    service.searchByName();
                    break;
                case 6:
                    service.sortByPrice();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }
}
