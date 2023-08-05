package controller.sub_menu;

import controller.FuramaController;
import service.facility.FacilityServiceImpl;
import service.facility.IFacilityService;

import java.util.Scanner;

public class FacilityManagement {
    private static IFacilityService facilityService = new FacilityServiceImpl();
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
                    facilityService.displayList();
                    break;
                case 2:
                    facilityService.addNew();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    facilityService.delete();
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

