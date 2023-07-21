package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p3_service;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.model.Product;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p4_repository.ProductRepositoryImpl;

import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    private static IProductRepository productRepository = new ProductRepositoryImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void showProductList() {
        productRepository.showProductList();
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
        productRepository.showProductList();
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

    }
}
