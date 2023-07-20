package ss12_java_collection_framework.bai_tap.product_manager.bai_1.repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;

import java.util.ArrayList;

public class ManagerRepositoryImpl implements IManagerRepository{
    private ArrayList<Products> productsList = new ArrayList<>();
    @Override
    public ArrayList<Products> displayAll() {
        return productsList;
    }

    @Override
    public void addProduct() {

    }

    @Override
    public void removeProductByID(int id) {

    }

    @Override
    public void updateProductByID(int id) {

    }

    @Override
    public void sortByAscendingPrice() {

    }

    @Override
    public void sorByDescendingPrice() {

    }

    @Override
    public ArrayList<Products> searchProductByName(String name) {
        return null;
    }
}
