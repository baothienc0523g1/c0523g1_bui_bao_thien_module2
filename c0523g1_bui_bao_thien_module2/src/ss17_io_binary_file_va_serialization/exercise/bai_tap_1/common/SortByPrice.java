package ss17_io_binary_file_va_serialization.exercise.bai_tap_1.common;

import ss17_io_binary_file_va_serialization.exercise.bai_tap_1.model.ProductSs17;

import java.util.Comparator;

public class SortByPrice implements Comparator<ProductSs17> {
    @Override
    public int compare(ProductSs17 o1, ProductSs17 o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
