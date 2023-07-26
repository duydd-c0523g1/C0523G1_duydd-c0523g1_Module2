package ss17_binary_file_serialization.repository;

import ss17_binary_file_serialization.model.Product;

import java.util.ArrayList;

public interface ProductRepository {
    ArrayList<Product> displayAll();
    void addProduct(Product product);
    void searchProduct(int id);
}
