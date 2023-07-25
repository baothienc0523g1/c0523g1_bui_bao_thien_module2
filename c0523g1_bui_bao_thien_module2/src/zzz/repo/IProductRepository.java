package zzz.repo;

import zzz.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getList();
    ArrayList<Product> search(String name);
    ArrayList<Product> sort();
    void add(Product product);
    void remove(int id);
    void adjustment(int id, Product product);
}
