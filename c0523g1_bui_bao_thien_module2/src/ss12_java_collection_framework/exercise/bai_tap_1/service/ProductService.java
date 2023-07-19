package ss12_java_collection_framework.exercise.bai_tap_1.service;

import ss12_java_collection_framework.exercise.bai_tap_1.model.Product;
import ss12_java_collection_framework.exercise.bai_tap_1.repository.IProductRepository;
import ss12_java_collection_framework.exercise.bai_tap_1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new product ID: ");
        int id = Integer.parseInt(scanner.next());
        System.out.print("Enter new product name: ");
        String name = scanner.next();
        System.out.print("Enter new product price: ");
        int price = Integer.parseInt(scanner.next());
        Product product = new Product(id, name, price);
        productRepository.addProduct(product);
    }

    @Override
    public void adjustment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of product: ");
        int id = Integer.parseInt(scanner.next());
        int count = 0;

        for (int i = 0; i < productRepository.getList().size(); i++) {
            count++;
            if (productRepository.getList().get(i).getId() == id) {
                System.out.print("Enter new product name: ");
                String name = scanner.next();
                System.out.print("Enter new product price: ");
                int price = Integer.parseInt(scanner.next());
                Product product = new Product(id, name, price);
                productRepository.adjustment(id, product);
                break;
            }
            if (count == productRepository.getList().size()) {
                System.out.println("Invalid ID");
                continue;
            }
        }
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id need to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.remove(id);
        System.out.println("Product with ID: " + id + " is removed");
    }

    @Override
    public void getList() {
        List<Product> productList = productRepository.getList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of product: ");
        String name = scanner.nextLine();
        List<Product> productList = productRepository.search(name);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByPriceIncrease() {
        List<Product> productList = productRepository.sortByPriceIncrease();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByPriceDecrease() {
        List<Product> productList = productRepository.sortByPriceDecrease();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
