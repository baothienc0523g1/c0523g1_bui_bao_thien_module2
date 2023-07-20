package ss12_java_collection_framework.exercise.bai_tap_1.repository;

import ss12_java_collection_framework.exercise.bai_tap_1.common.DecreaseCompare;
import ss12_java_collection_framework.exercise.bai_tap_1.common.IncreaseCompare;
import ss12_java_collection_framework.exercise.bai_tap_1.model.Product;

import java.util.ArrayList;
import java.util.Collections;

public class ProductRepository  implements IProductRepository {
    static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Tiger", 10000));
        productList.add(new Product(2, "Heineken", 15000));
        productList.add(new Product(3, "Budweiser", 18000));
        productList.add(new Product(4, "Larue", 14000));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void adjustment(int id, Product products) {
        for (Product product : productList) {
            if (product.getId() == id) ;
            product.setId(id);
            product.setName(products.getName());
            product.setPrice(products.getPrice());
            break;
        }
    }

    @Override
    public void remove(int id) {
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            count++;
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
        if (count == productList.size()) {
            System.out.println("Invalid ID");
        }
    }

    @Override
    public ArrayList<Product> getList() {
        return productList;
    }

    @Override
    public ArrayList<Product> search(String name) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                products.add(product);
                break;
            }
        }
        return products;
    }

    @Override
    public ArrayList<Product> sortByPriceIncrease() {
        IncreaseCompare increaseCompare = new IncreaseCompare();
        Collections.sort(productList, increaseCompare);
        return productList;
    }

    @Override
    public ArrayList<Product> sortByPriceDecrease() {
        DecreaseCompare decreaseCompare = new DecreaseCompare();
        Collections.sort(productList, decreaseCompare);
        return productList;
    }
}
