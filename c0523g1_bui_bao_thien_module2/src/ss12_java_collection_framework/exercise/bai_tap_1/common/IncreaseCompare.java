package ss12_java_collection_framework.exercise.bai_tap_1.common;

import ss12_java_collection_framework.exercise.bai_tap_1.model.Product;

import java.util.Comparator;

public class IncreaseCompare implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
