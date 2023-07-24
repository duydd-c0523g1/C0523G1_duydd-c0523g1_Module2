package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.common;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;

import java.util.Comparator;

public class SortByAscendingPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
