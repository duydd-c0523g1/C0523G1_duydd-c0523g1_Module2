package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    void showProductList();
    void addProduct(Product product);
    void removeProduct(int id);
    void searchProduct(String name);
    void updateProduct(Product product);
    void sortProduct();
}
