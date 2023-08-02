package controller.sub_menu;

import controller.FuramaController;
import service.customer_service.CustomerServiceImpl;
import service.customer_service.ICustomerService;

import java.util.Scanner;

public class CustomerManagement {
    private static ICustomerService customerService = new CustomerServiceImpl();
    public static void customerManagement() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Customer Management-------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search customer by name");
            System.out.println("6. Return to main menu");
            System.out.print("Your selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    customerService.displayList();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    customerService.searchByName();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (true);
    }
}

