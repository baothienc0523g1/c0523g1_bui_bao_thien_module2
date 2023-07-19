package ss12_java_collection_framework.exercise.bai_tap_1.controller;

import ss12_java_collection_framework.exercise.bai_tap_1.service.IProductService;
import ss12_java_collection_framework.exercise.bai_tap_1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("---PRODUCT MANAGER----");
            System.out.println("Press 1: Get list of products");
            System.out.println("Press 2: Add a product");
            System.out.println("Press 3: Remove a product by ID");
            System.out.println("Press 4: Adjustment product");
            System.out.println("Press 5: Get sorted increase price list ");
            System.out.println("Press 6: Get sorted decrease price list ");
            System.out.println("Press 7: Find a product by name");
            System.out.println("Press 0: Exit");
            int choice = Integer.parseInt(scanner.next());

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
                    service.sortByPriceIncrease();
                    break;
                case 6:
                    service.sortByPriceDecrease();
                    break;
                case 7:
                    service.search();
                    break;
                case 0:
                    System.out.println("Stopped");
                    System.exit(0);
            }
        } while (true);
    }
}
