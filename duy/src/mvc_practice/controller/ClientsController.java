package mvc_practice.controller;

import mvc_practice.model.Clients;
import mvc_practice.service.ClientsServiceImpl;
import mvc_practice.service.IClientsService;

import java.util.Scanner;

public class ClientsController {
    private static IClientsService clientsService = new ClientsServiceImpl();

    public static void main(String[] args) {
        //Controller
        Scanner scanner = new Scanner(System.in);
        int select;
        int id;
        do {
            System.out.println("----- Customer Manager ------");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Delete by ID");
            System.out.println("4. Find customer by keyword");
            System.out.println("9. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1: //Hiển thị danh sách khách hàng
                    clientsService.showCustomerList();
                    break;
                case 2: //create
                    System.out.print("Input id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input type: ");
                    String type = scanner.nextLine();
                    Clients clients = new Clients(id, name, age, type);
                    clientsService.addCustomer(clients);
                    break;
                case 3: //Xóa theo ID
                    System.out.print("Input customer's ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    clientsService.removeCustomerById(id);
                    clientsService.showCustomerList();
                    break;
                case 4: //Tìm kiếm gần đúng
                    System.out.print("Input keyword: ");
                    String keyword = scanner.nextLine();
                    clientsService.searchCustomerByName(keyword);
                    System.out.println(clientsService.searchCustomerByName(keyword));
                    break;
                case 9: //exit
                    System.exit(0);
            }
        } while (true);
    }
}
