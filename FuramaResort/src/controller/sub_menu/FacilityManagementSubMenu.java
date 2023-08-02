package controller.sub_menu;

import controller.FuramaController;
import service.facility_service.FacilityServiceImpl;
import service.facility_service.IFacilityService;

import java.util.Scanner;

public class FacilityManagementSubMenu {
    private static IFacilityService facilityService = new FacilityServiceImpl();
    public static void facilitySubMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Facility Sub-Menu-------");
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    FacilityManagement.facilityManagement();
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (true);
    }
}

