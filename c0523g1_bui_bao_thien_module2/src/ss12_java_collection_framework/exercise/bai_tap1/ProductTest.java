package ss12_java_collection_framework.exercise.bai_tap1;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Product products = new Product();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Press 1 to get list of product");
            System.out.println("Press 2 to adjustment a product by ID");
            System.out.println("Press 3 to add a product");
            System.out.println("Press 4 to remove a product by ID");
            System.out.println("Press 5 to find a product by name");
            System.out.println("Press 6 to sort all product by ID");
            System.out.println("Press 0 to Exit");
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 0:
                    System.out.println("Program stopped!");
                    System.exit(0);
                case 1:
                    products.getList();
                    break;
                case 2:
                    System.out.println("Enter Product's ID you want to adjustment");
                    int id = Integer.parseInt(scanner.next());
                    products.adjustment(id);
                    break;
                case 3:
                    products.addProduct();
                    break;
                case 4:
                    System.out.println("Enter Product's ID you want to remove");
                    int removeID = Integer.parseInt(scanner.next());
                    products.remove(removeID);
                    break;
                case 5:
                    System.out.println("Enter Product's name you want to find");
                    String fix1 = scanner.nextLine();
                    String inputName = scanner.nextLine();
                    System.out.println(products.findByName(inputName));
                    break;
                case 6:
                    Product.listOfProduct.sort(Product::compareTo);
                    System.out.println("List of product sorted by ID: ");
                    products.getList();
                    break;
            }
        }
        while (true);
    }
}
