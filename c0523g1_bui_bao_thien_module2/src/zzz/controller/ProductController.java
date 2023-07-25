package zzz.controller;

import zzz.service.IProductService;
import zzz.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("1. show list");
            System.out.println("2. add");
            System.out.println("3. remove");
            System.out.println("4. search");
            System.out.println("5. adjustment");
            System.out.println("6. sort by price");
            System.out.println("0. exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please a number key");
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
                    service.search();
                    break;
                case 5:
                    service.adjustment();
                    break;
                case 6:
                    service.sort();
                    break;
                case 0:
                    System.out.println("Stopped!");
                    System.exit(0);
            }
        } while (true);
    }
}
