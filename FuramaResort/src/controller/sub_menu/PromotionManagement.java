package controller.sub_menu;

import controller.FuramaController;

import java.util.Scanner;

public class PromotionManagement {
    public static void promotionManagement() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Promotion Management-------");
            System.out.println("1. Display list customer usage services");
            System.out.println("2. Display list customer vouchers");
            System.out.println("3. Return to main menu");
            System.out.print("Your selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (true);
    }
}
