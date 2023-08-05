package repository.customer;

import model.facility.Facility;
import model.person.customer.Customer;
import utils.Stream;

import java.util.*;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static final String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\customer.csv";
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
    public Map<Facility, Integer> displayList() {
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
    public void edit(String id, Customer customerEdit) {
        ArrayList<Customer> customerList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            if (c.getCustomerID().equals(id)) {
                c.setName(customerEdit.getName());
                c.setDob(customerEdit.getDob());
                c.setGender(customerEdit.getGender());
                c.setIdentificationNumber(customerEdit.getIdentificationNumber());
                c.setPhoneNumber(customerEdit.getPhoneNumber());
                c.setEmail(customerEdit.getEmail());
                c.setCustomerType(customerEdit.getCustomerType());
                c.setCustomerAddress(customerEdit.getCustomerAddress());
            }
            stringList.add(c.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(String id) {
        ArrayList<Customer> customerList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerID().equals(id)) {
                customerList.remove(i);
                break;
            }
        }
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoToCSV());
        }
        Stream.write(FILE_PATH, stringList, false);
        displayList();
    }
}