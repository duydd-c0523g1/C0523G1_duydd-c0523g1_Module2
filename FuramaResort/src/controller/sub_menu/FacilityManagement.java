package controller.sub_menu;

import controller.FuramaController;

import java.util.Scanner;

public class FacilityManagement {
    public static void facilityManagement() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Facility Management-------");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facilities maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return to main menu");
            System.out.print("Your selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (true);
    }
}

