package controller;

import controller.sub_menu.*;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Furama Menu-------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Your selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    EmployeeManagement.employeeManagement();
                    break;
                case 2:
                    CustomerManagement.customerManagement();
                    break;
                case 3:
                    FacilityManagement.facilityManagement();
                    break;
                case 4:
                    BookingManagement.bookingManagement();
                    break;
                case 5:
                    PromotionManagement.promotionManagement();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        } while (true);
    }
}
