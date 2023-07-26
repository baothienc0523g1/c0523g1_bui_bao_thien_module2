package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.repository;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.common.SortByPrice;
import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.common.WriteAndRead;
import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.model.ProductSs17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ProductRepositorySs17 extends WriteAndRead implements IProductRepositorySs17, Serializable {

    private static ArrayList<ProductSs17> productsList = new ArrayList<>();

    private static String fileLocation = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss17_io_binary_file_va_serialization\\exercise\\bai_tap_1\\repository\\my_repo.txt";

    {
        productsList.add(new ProductSs17(1, "iPhone", 3500, "Apple", "Cell phone"));
        productsList.add(new ProductSs17(2, "Galaxy S2", 1000, "SamSung", "Cell phone"));
        productsList.add(new ProductSs17(3, "Apple pen", 500, "Apple", "E-Pen"));
        productsList.add(new ProductSs17(4, "Rolex Daytona", 99999, "Rolex", "Watch"));
    }

    @Override
    public ArrayList<ProductSs17> getList() {
        return readFromFile(fileLocation);
    }

    @Override
    public ArrayList<ProductSs17> search(String name) {
        ArrayList<ProductSs17> products = readFromFile(fileLocation);
        ArrayList<ProductSs17> result = new ArrayList<>();

        for (ProductSs17 temp : products) {
            if (temp.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(temp);
            }
        }
        return result;
    }

    @Override
    public ArrayList<ProductSs17> sortByPrice() {
        SortByPrice sort = new SortByPrice();
        ArrayList<ProductSs17> temp = readFromFile(fileLocation);
        Collections.sort(temp, sort);
        return temp;
    }

    @Override
    public void add(ProductSs17 product) {
        ArrayList<ProductSs17> temp = productsList;
        temp.add(product);
        writeToFile(temp, fileLocation);
    }

    @Override
    public void remove(int id) {
        ArrayList<ProductSs17> temp = readFromFile(fileLocation);
        for (ProductSs17 product : temp) {
            if (product.getId() == id) {
                temp.remove(product);
                writeToFile(temp, fileLocation);
                break;
            }
        }
    }

    @Override
    public void adjustment(int id, ProductSs17 product1) {
        ArrayList<ProductSs17> temp = readFromFile(fileLocation);
        for (ProductSs17 product : temp) {
            if (product.getId() == id) {
                product.setId(id);
                product.setPrice(product1.getPrice());
                product.setName(product1.getName());
                product.setBrand(product1.getBrand());
                product.setDescription(product1.getDescription());
            }
        }
        writeToFile(temp, fileLocation);
    }

}