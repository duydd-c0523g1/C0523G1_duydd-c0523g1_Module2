package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;

import java.util.ArrayList;

public class ProductRepositoryImpl implements IProductRepository {
    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void showProductList() {
        if (productList.size() == 0) {
            System.out.println("The list is empty");
        } else {
            for (int i = 0; i < productList.size(); i++) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void removeProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
            } else {
                System.out.println("Product does not exist");
            }
        }
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
            } else {
                System.out.println("Product does not exist");
            }
        }
    }

    @Override
    public void sortProduct() {
    }
}