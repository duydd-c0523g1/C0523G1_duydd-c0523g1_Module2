package ss12_java_collection_framework.bai_tap.product_manager.bai_1.service;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1.repository.IManagerRepository;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1.repository.ManagerRepositoryImpl;

import java.util.ArrayList;

public class ManagerServiceImpl implements IManagerService {
    private IManagerRepository managerRepository = new ManagerRepositoryImpl();

    @Override
    public ArrayList<Products> displayAll() {
        return managerRepository.displayAll();
    }

    @Override
    public void addProduct(Products products) {
        managerRepository.addProduct(products);
    }

    @Override
    public void removeProductByID(int id) {
        managerRepository.removeProductByID(id);
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
        return managerRepository.searchProductByName(name);
    }
}
