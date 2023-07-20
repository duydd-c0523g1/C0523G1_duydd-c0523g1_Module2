package ss12_java_collection_framework.bai_tap.product_manager.bai_1.controller;

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
            System.out.println("6. Sort Products");
            System.out.println("9. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (true);
    }
}
