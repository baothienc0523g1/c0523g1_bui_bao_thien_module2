package ss12_java_collection_framework.exercise.bai_tap1;

import java.util.ArrayList;

import java.util.Scanner;

public class Product implements Comparable<Product> {
    /*[Bài tập] Luyện tập sử dụng ArrayList,
     * LinkedList trong Java Collection Framework*/
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    static ArrayList<Product> listOfProduct = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Sting", 9000);
        Product product2 = new Product(3, "RedBull", 12000);
        Product product3 = new Product(4, "CocaCola", 10000);
        Product product4 = new Product(2, "Tiger Bac", 15000);
        listOfProduct.add(product1);
        listOfProduct.add(product2);
        listOfProduct.add(product3);
        listOfProduct.add(product4);
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter name of product");
        String name = scanner.next();
        System.out.println("Enter price of product");
        int price = scanner.nextInt();

        Product newProduct = new Product(id, name, price);
        listOfProduct.add(newProduct);
    }

    public void adjustment(int id) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int size = listOfProduct.size();
        for (int i = 0; i < listOfProduct.size(); i++) {
            if (listOfProduct.get(i).getId() == (id)) {
                listOfProduct.remove(i);
                System.out.println("Enter the new information");
                System.out.println("Enter name of product");
                String name = scanner.next();
                System.out.println("Enter price of product");
                int price = scanner.nextInt();

                Product newProduct = new Product(id, name, price);
                listOfProduct.add(newProduct);
            } else {
                count++;
                if (count == size) {
                    System.out.println("Invalid ID, try again");
                    continue;
                }
            }
        }
    }

    public void remove(int id) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < listOfProduct.size(); i++) {
            count++;
            if (listOfProduct.get(i).getId() == id) {
                listOfProduct.remove(i);
                System.out.println("ID: " + id + " removed!" );
            } else if (count == listOfProduct.size()) {
                System.out.println("Invalid ID");
                continue;
            }
        }
    }

    public void getList() {
        for (Product product : listOfProduct) {
            System.out.println(product.toString());
        }
    }

    public Product findByName(String name) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Product findTemp = new Product();
        for (int i = 0; i < listOfProduct.size(); i++) {
            count++;
            if (listOfProduct.get(i).getName().contains(name)) {
                count--;
                findTemp = listOfProduct.get(i);
            }
        }
        if (count == listOfProduct.size()) {
            return null;
        } else {
            return findTemp;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void sortById() {

    }

    @Override
    public int compareTo(Product product) {
        if (product.id == this.id) {
            return 0;
        } else if (product.id > this.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
