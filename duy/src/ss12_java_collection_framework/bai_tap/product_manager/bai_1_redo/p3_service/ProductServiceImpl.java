package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p3_service;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    private static IProductRepository productRepository = new ProductRepositoryImpl();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showProductList() {
       ArrayList<Product> productList = productRepository.showProductList();
        if (productList.size() == 0) {
            System.out.println("The list is empty");
        } else {
            for (int i = 0; i < productList.size(); i++) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Input ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Name");
        String name = scanner.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepository.addProduct(product);
        System.out.println("Updated list:");
        productRepository.showProductList();
    }

    @Override
    public void removeProduct() {
        System.out.println("Input ID to delete");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.removeProduct(id);
        System.out.println("Updated list:");
        this.showProductList();
    }

    @Override
    public void searchProduct() {
        System.out.println("Input product name");
        String name = scanner.nextLine();
        productRepository.searchProduct(name);
    }

    @Override
    public void updateProduct() {
        System.out.println("Input product ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input new name");
        String newName = scanner.nextLine();
        System.out.println("Input new price");
        int newPrice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, newName, newPrice);
        productRepository.updateProduct(product);
        System.out.println("Updated list:");
        productRepository.showProductList();
    }

    @Override
    public void sortProduct() {
        ArrayList<Product> products = productRepository.sortProduct();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
