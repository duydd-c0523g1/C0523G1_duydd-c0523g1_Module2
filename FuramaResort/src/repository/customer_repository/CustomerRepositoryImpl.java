package repository.customer_repository;

import model.person.customer.Customer;
import model.person.employee.Employee;
import utils.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\customer.csv";
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Customer> searchByName(String name) {
        ArrayList<Customer> customerList = this.displayList();
        List<Customer> customerSearchList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getName(), name)) {
                customerSearchList.add(customerList.get(i));
            } else {
                System.out.println("Khách hàng không tồn tại");
            }
        }
        return customerSearchList;
    }

    @Override
    public ArrayList<Customer> displayList() {
        ArrayList<Customer> customerList = new ArrayList<>();
        List<String> stringList = Stream.read(FILE_PATH);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        customerList.add(customer);
        for (int i = 0; i < customerList.size(); i++) {
            stringList.add(customerList.get(i).getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, true);
    }

    @Override
    public void edit(Customer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void edit(String id) {
        ArrayList<Customer> customerList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            if (c.getCustomerID().equals(id)) {
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
                System.out.println("Nhập ID Khách hàng");
                String newId = scanner.nextLine();
                System.out.println("Nhập loại khách hàng");
                String newType = scanner.nextLine();
                System.out.println("Nhập địa chỉ khách hàng");
                String newAddress = scanner.nextLine();
                c.setName(newName);
                c.setDob(newDob);
                c.setGender(newGender);
                c.setIdentificationNumber(newCustomerIdentificationNumber);
                c.setPhoneNumber(newPhoneNumber);
                c.setEmail(newEmail);
                c.setCustomerID(newId);
                c.setCustomerType(newType);
                c.setCustomerAddress(newAddress);
            }
            stringList.add(c.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(int id) {
        ArrayList<Customer> customerList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (Integer.parseInt(customerList.get(i).getCustomerID()) == id) {
                customerList.remove(customerList.get(i));
            } else {
                System.out.println("ID không tồn tại");
                break;
            }
            stringList.add(customerList.get(i).getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
    }
}