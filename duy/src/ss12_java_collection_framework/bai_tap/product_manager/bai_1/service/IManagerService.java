package ss12_java_collection_framework.bai_tap.product_manager.bai_1.service;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;

import java.util.ArrayList;

public interface IManagerService {
    ArrayList<Products> displayAll ();
    void addProduct (Products products);
    void removeProductByID (int id);
    void updateProductByID (int id);
    void sortByAscendingPrice ();
    void sorByDescendingPrice ();
    ArrayList<Products> searchProductByName (String name);
}
