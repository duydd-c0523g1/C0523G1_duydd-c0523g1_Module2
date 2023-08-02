package service.customer_service;

import model.person.customer.Customer;
import repository.customer_repository.CustomerRepositoryImpl;
import repository.customer_repository.ICustomerRepository;

import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerService = new CustomerRepositoryImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
        customerService.displayList();
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh khách hàng");
        String dob = scanner.nextLine();
        System.out.println("Nhập giới tính khách hàng");
        String gender = scanner.nextLine();
        System.out.println("Nhập số CMND/CCCD khách hàng");
        String customerIdentificationNumber = scanner.nextLine();
        System.out.println("Nhập số điện thoại khách hàng");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email khách hàng");
        String email = scanner.nextLine();
        System.out.println("Nhập ID Khách hàng");
        String id = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        String type = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(name, dob, gender, customerIdentificationNumber, phoneNumber, email, id, type, address);
        customerService.addNew(customer);
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        customerService.edit(id);
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID khách hàng");
        int id = Integer.parseInt(scanner.nextLine());
        customerService.delete(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        customerService.searchByName(name);
    }
}
