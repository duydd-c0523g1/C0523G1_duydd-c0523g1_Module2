package controller.sub_menu;

import controller.FuramaController;

import java.util.Scanner;

public class BookingManagement {
    public static void bookingManagement() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Booking Management-------");
            System.out.println("1. Display list bookings");
            System.out.println("2. Add new booking");
            System.out.println("3. Create new contrat");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contract");
            System.out.println("6. Return to main menu");
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

