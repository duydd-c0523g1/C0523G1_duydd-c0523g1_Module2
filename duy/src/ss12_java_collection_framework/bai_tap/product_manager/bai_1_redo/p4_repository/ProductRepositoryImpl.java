package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.common.SortByAscendingPrice;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p2_controller.ProductController;

import java.util.ArrayList;
import java.util.Collections;

public class ProductRepositoryImpl implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();
     static {
         productList.add(new Product(1,"A",25000));
         productList.add(new Product(2,"B",26000));
         productList.add(new Product(3,"C",27000));
         productList.add(new Product(4,"D",28000));
     }
    @Override
    public ArrayList<Product> showProductList() {
         // code đọc file
      return productList;
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
    public ArrayList<Product> sortProduct() {
        SortByAscendingPrice sortByAscendingPrice = new SortByAscendingPrice();
        Collections.sort(productList,sortByAscendingPrice);
        return productList;
    }
}