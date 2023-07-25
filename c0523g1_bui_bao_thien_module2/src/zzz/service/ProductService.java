package zzz.service;

import zzz.model.Product;
import zzz.repo.IProductRepository;
import zzz.repo.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService{
    private static IProductRepository repository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    private boolean idCheck(int id) {
        boolean flag = false;
        for (Product temp : repository.getList()) {
            if (temp.getId() == id) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public void getList() {
        ArrayList<Product> temp = repository.getList();
        for (Product product : temp) {
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter new product ID");
        int id = Integer.parseInt(scanner.nextLine());
        if (!idCheck(id)) {
            System.out.println("Enter new product name");
            String name = scanner.nextLine();
            System.out.println("Enter new product price");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(id, name, price);
            repository.add(product);
            System.out.println("Product successfully added to list");
        } else {
            System.out.println("ID already exist");
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter id of product need to remove");
        int id = Integer.parseInt(scanner.nextLine());
        if (idCheck(id)) {
            repository.remove(id);
            System.out.println("Product with id " + id + " is removed");
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void adjustment() {
        System.out.println("Enter id of product need to adjustment");
        int id = Integer.parseInt(scanner.nextLine());
        if (idCheck(id)) {
            System.out.println("Enter product new name");
            String name = scanner.nextLine();
            System.out.println("Enter product new price");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(id, name, price);
            repository.adjustment(id, product);
            System.out.println("Product with id " + id + " is updated");
        } else {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public void sort() {
        for (Product product : repository.sort()) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("Enter product name need to search");
        String name = scanner.nextLine();
        if (repository.search(name) != null) {
            System.out.println(repository.search(name));
        } else {
            System.out.println("Cant find that product");
        }
    }
}
