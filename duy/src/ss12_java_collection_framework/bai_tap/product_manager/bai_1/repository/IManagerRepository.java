package ss12_java_collection_framework.bai_tap.product_manager.bai_1.repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;

import java.util.ArrayList;

public interface IManagerRepository {
    ArrayList<Products> displayAll ();
    void addProduct ();
    void removeProductByID (int id);
    void updateProductByID (int id);
    void sortByAscendingPrice ();
    void sorByDescendingPrice ();
    ArrayList<Products> searchProductByName (String name);
}
