package ss12_java_collection_framework.bai_tap.product_manager.bai_1.repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerRepositoryImpl implements IManagerRepository {
    private ArrayList<Products> productsList = new ArrayList<>();

    @Override
    public ArrayList<Products> displayAll() {
        return productsList;
    }

    @Override
    public void addProduct(Products products) {
        productsList.add(products);
    }

    @Override
    public void removeProductByID(int id) {
        productsList.removeIf(products -> products.getId() == id);
    }

    @Override
    public void updateProductByID(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Products products : productsList) {
            if (products.getId() == id) {
                System.out.print("Input New Name: ");
                products.setName(scanner.nextLine());
                System.out.println("Input New Price");
                products.setPrice(scanner.nextDouble());
            }
        }
    }

    @Override
    public void sortByAscendingPrice() {

    }

    @Override
    public void sorByDescendingPrice() {

    }

    @Override
    public ArrayList<Products> searchProductByName(String name) {
        ArrayList<Products> searchResult = new ArrayList<>();
        for (Products product : productsList) {
            if (product.getName().contains(name)) {
                searchResult.add(product);
            }
        }
        return searchResult;
    }
}
