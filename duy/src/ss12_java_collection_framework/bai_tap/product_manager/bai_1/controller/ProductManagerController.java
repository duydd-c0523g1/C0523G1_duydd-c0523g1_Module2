package ss12_java_collection_framework.bai_tap.product_manager.bai_1.controller;

import ss12_java_collection_framework.bai_tap.product_manager.bai_1.model.Products;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1.service.IManagerService;
import ss12_java_collection_framework.bai_tap.product_manager.bai_1.service.ManagerServiceImpl;

import java.util.Scanner;

public class ProductManagerController {
    private static IManagerService managerService = new ManagerServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("----- Products Manager -----");
            System.out.println("1. Display Products List");
            System.out.println("2. Add New Product");
            System.out.println("3. Delete Product by ID");
            System.out.println("4. Find Product");
            System.out.println("5. Update Product");
            System.out.println("6. Sort Products by Price");
            System.out.println("9. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println(managerService.displayAll());
                    break;
                case 2:
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    Products products = new Products(id, price, name);
                    managerService.addProduct(products);
                    System.out.println(managerService.displayAll());
                    break;
                case 3:
                    System.out.println("Input Product ID to Delete");
                    id = Integer.parseInt(scanner.nextLine());
                    managerService.removeProductByID(id);
                    System.out.println(managerService.displayAll());
                    break;
                case 4:
                    System.out.println("Input Product Name");
                    name = scanner.nextLine();
                    System.out.println(managerService.searchProductByName(name));
                    break;
                case 5:
                    System.out.println("Input Product ID to Update");
                    id = Integer.parseInt(scanner.nextLine());
                    managerService.updateProductByID(id);
                    System.out.println("Success");
                    System.out.println(managerService.displayAll());
                    break;
                case 6:
                    int sortOption;
                    System.out.println("Input 1 For Ascending Sort\n Input 2 For Descending Sort");
                    sortOption = Integer.parseInt(scanner.nextLine());
                    if (sortOption == 1) {

                    } else if (sortOption == 2) {

                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                case 9:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (true);
    }
}
