package ss12_java_collection_framework.exercise.bai_tap_1.repository;

import ss12_java_collection_framework.exercise.bai_tap_1.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    void addProduct(Product product);
    void adjustment(int id, Product product);
    void remove(int id);
    ArrayList<Product> getList();
    ArrayList<Product> search(String name);
    ArrayList<Product> sortByPriceIncrease();
    ArrayList<Product> sortByPriceDecrease();
}
