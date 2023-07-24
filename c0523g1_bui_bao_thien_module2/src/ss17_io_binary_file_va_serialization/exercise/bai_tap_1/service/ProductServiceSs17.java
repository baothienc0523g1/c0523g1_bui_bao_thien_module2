package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.service;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.model.ProductSs17;
import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.repository.IProductRepositorySs17;
import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.repository.ProductRepositorySs17;

import java.util.Scanner;

public class ProductServiceSs17 implements IProductServiceSs17 {
    private static IProductRepositorySs17 repository = new ProductRepositorySs17();
    private static Scanner scanner = new Scanner(System.in);

    private boolean idCheck(int id) {
        boolean flag = false;
        for (ProductSs17 temp : repository.getList()) {
            if (temp.getId() == id) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void getList() {
        for (ProductSs17 temp : repository.getList()) {
            System.out.println(temp);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter new product id");
        int id = Integer.parseInt(scanner.nextLine());
        if (!idCheck(id)) {
            System.out.println("Enter new product name");
            String name = scanner.nextLine();
            System.out.println("Enter new product price");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter new product brand");
            String brand = scanner.nextLine();
            System.out.println("Enter new product description");
            String description = scanner.nextLine();

            ProductSs17 newProduct = new ProductSs17(id, name, price, brand, description);
            repository.add(newProduct);

            System.out.println("Product with ID " + id + " added to list");
        } else {
            System.out.println("ID already exist");
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter id of the product need to remove");
        int id = Integer.parseInt(scanner.nextLine());
        if (idCheck(id)) {
            repository.remove(id);
            System.out.println("Product with ID " + id + " is removed");
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void adjustment() {
        System.out.println("Enter id of the product need to adjustment");
        int id = Integer.parseInt(scanner.nextLine());
        if (idCheck(id)) {
            System.out.println("Enter product new name");
            String name = scanner.nextLine();
            System.out.println("Enter product new price");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter product new brand");
            String brand = scanner.nextLine();
            System.out.println("Enter product new description");
            String description = scanner.nextLine();

            ProductSs17 updateProduct = new ProductSs17(id, name, price, brand, description);
            repository.adjustment(id, updateProduct);

            System.out.println("Product with ID " + id + " is updated");
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void sortByPrice() {
        for (ProductSs17 temp : repository.getList()) {
            System.out.println(temp);
        }
    }

    @Override
    public void searchByName() {
        System.out.println("Enter product name");
        String name = scanner.nextLine();
        if (repository.search(name) != null) {
            System.out.println(repository.search(name));
        } else {
            System.out.println("Product not exist in system");
        }
    }
}
