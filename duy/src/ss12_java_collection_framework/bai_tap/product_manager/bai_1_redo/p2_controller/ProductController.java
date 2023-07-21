package ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p2_controller;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p3_service.IProductService;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1_redo.p3_service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {

    private static IProductService productService = new ProductServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int selection = 0;
        do {
            System.out.println("-----Product Manager-----");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product");
            System.out.println("4. Search Product");
            System.out.println("5. Update product");
            System.out.println("6. Sort products");
            System.out.print("Select function: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    productService.showProductList();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    productService.searchProduct();
                    break;
                case 5:
                    productService.updateProduct();
                    break;
                case 6:
                    productService.sortProduct();
                case 9:
                    System.exit(1);
                default:
                    System.out.println("Invalid input");
            }
        } while (true);
    }
}
