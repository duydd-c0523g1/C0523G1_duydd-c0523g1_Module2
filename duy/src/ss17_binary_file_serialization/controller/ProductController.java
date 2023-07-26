package ss17_binary_file_serialization.controller;

import ss17_binary_file_serialization.service.ProductService;
import ss17_binary_file_serialization.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    private ProductService productService = (ProductService) new ProductServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int selection = 0;
        do {
            System.out.println("-----Product Manager-----");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Search product");
            System.out.println("9. Exit");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    productService.displayAll();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 9:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (true);
    }
}