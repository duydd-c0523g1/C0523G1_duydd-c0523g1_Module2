package mvc_practice.repository;

import mvc_practice.model.Customer;

import java.util.ArrayList;

public interface IClientsRepository {
    ArrayList<Customer> findAll();

    void addCustomer(Customer customer);

    void removeCustomerById(int id);

    ArrayList<Customer> searchCustomerByName(String name);
}
