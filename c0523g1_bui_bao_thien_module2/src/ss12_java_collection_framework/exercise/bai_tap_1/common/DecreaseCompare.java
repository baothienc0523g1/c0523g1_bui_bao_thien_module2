package ss12_java_collection_framework.exercise.bai_tap_1.common;

import ss12_java_collection_framework.exercise.bai_tap_1.model.Product;

import java.util.Comparator;

public class DecreaseCompare implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
