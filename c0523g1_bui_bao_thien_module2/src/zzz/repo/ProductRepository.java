package zzz.repo;

import zzz.common.SortByPrice;
import zzz.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ProductRepository implements IProductRepository, Serializable {
    private static ArrayList<Product> productArrayList = new ArrayList<>();
    static {
        productArrayList.add(new Product(1, "A",900));
        productArrayList.add(new Product(2, "B",1900));
        productArrayList.add(new Product(3, "C",9200));
        productArrayList.add(new Product(4, "D",200));
        productArrayList.add(new Product(5, "E",5000));
        productArrayList.add(new Product(6, "A",800));
    }
    @Override
    public ArrayList<Product> getList() {
        return productArrayList;
    }

    @Override
    public ArrayList<Product> search(String name) {
        ArrayList<Product> tempList = new ArrayList<>();

        for (Product temp : productArrayList) {
            if (temp.getName().toLowerCase().contains(name.toLowerCase())) {
                tempList.add(temp);
            }
        }
        return tempList;
    }

    @Override
    public ArrayList<Product> sort() {
        SortByPrice sort = new SortByPrice();
        Collections.sort(productArrayList, sort);
        return productArrayList;
    }

    @Override
    public void add(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void remove(int id) {

        for (Product temp : productArrayList) {
            if (temp.getId() == id) {
                productArrayList.remove(temp);
                break;
            }
        }
    }

    @Override
    public void adjustment(int id, Product product) {
        for (Product temp : productArrayList) {
            if (temp.getId() == id) {
                temp.setId(id);
                temp.setName(product.getName());
                temp.setPrice(product.getPrice());
            }
        }
    }
}
