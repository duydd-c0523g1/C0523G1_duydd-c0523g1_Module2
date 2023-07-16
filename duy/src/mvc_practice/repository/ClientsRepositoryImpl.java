package mvc_practice.repository;

import mvc_practice.model.Customer;

import java.util.ArrayList;

public class ClientsRepositoryImpl implements IClientsRepository {
    private static ArrayList<Customer> customerList = new ArrayList<>();

    @Override
    public ArrayList<Customer> findAll() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void removeCustomerById(int id) {
        customerList.removeIf(customer -> customer.getId() == id);
    }

    @Override
    public ArrayList<Customer> searchCustomerByName(String name) {
        ArrayList<Customer> searchResult = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getName().contains(name)) {
                searchResult.add(customer);
            }
        }
        return searchResult;
    }
}
