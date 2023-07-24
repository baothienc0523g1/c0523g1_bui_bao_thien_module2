package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.repository;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.model.ProductSs17;
import zzz.model.Product;

import java.util.ArrayList;

public interface IProductRepositorySs17 {
    ArrayList<ProductSs17> getList();
    ArrayList<ProductSs17> search(String name);
    ArrayList<ProductSs17> sortByPrice();
    void add(ProductSs17 productSs17);
    void remove(int id);
    void adjustment(int id, ProductSs17 product);

}
