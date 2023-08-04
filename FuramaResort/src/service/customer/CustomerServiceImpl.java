package service.customer;

import model.person.customer.Customer;
import repository.customer.CustomerRepositoryImpl;
import repository.customer.ICustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
       List<Customer> customerList = customerRepository.displayList();
       for (Customer customer : customerList){
           System.out.println(customer);
       }
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
        customerRepository.addNew(customer);
    }

    @Override
    public void edit() {
        List<Customer> customerList = customerRepository.displayList();
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getCustomerID().equals(id)){
                System.out.println("Nhập tên khách hàng");
                String newName = scanner.nextLine();
                System.out.println("Nhập ngày sinh khách hàng");
                String newDob = scanner.nextLine();
                System.out.println("Nhập giới tính khách hàng");
                String newGender = scanner.nextLine();
                System.out.println("Nhập số CMND/CCCD khách hàng");
                String newCustomerIdentificationNumber = scanner.nextLine();
                System.out.println("Nhập số điện thoại khách hàng");
                String newPhoneNumber = scanner.nextLine();
                System.out.println("Nhập Email khách hàng");
                String newEmail = scanner.nextLine();
                System.out.println("Nhập loại khách hàng");
                String newType = scanner.nextLine();
                System.out.println("Nhập địa chỉ khách hàng");
                String newAddress = scanner.nextLine();
                Customer customerEdit = new Customer(newName,newDob,newGender,newCustomerIdentificationNumber,newPhoneNumber,
                        newEmail,newType,newAddress);
                customerRepository.edit(id,customerEdit);
                break;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID khách hàng");
        String id = scanner.nextLine();
        customerRepository.delete(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        customerRepository.searchByName(name);
    }
}
