package controller.sub_menu;

import controller.FuramaController;
import service.employee_service.EmployeeServiceImpl;
import service.employee_service.IEmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    private static IEmployeeService employeeService = new EmployeeServiceImpl();
    public static void employeeManagement() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Employee Management-------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search employee by name");
            System.out.println("6. Return to main menu");
            System.out.print("Your selection: ");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1:
                    employeeService.displayList();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
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
