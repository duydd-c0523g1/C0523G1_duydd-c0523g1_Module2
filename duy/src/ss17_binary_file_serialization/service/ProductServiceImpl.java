package ss17_binary_file_serialization.service;

import ss17_binary_file_serialization.model.Product;
import ss17_binary_file_serialization.repository.ProductRepository;
import ss17_binary_file_serialization.repository.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        productRepository.displayAll();
    }

    @Override
    public void addProduct() {
        System.out.print("Input product ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Input product Name:");
        String name = scanner.nextLine();
        System.out.print("Input product Price:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Input product Brand:");
        String brand = scanner.nextLine();
        System.out.print("Input product Description:");
        String desc = scanner.nextLine();
        Product product = new Product(id, name, price, brand, desc);
        productRepository.addProduct(product);
    }

    @Override
    public void searchProduct() {
        System.out.println("Input product ID");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.searchProduct(id);
    }
}


