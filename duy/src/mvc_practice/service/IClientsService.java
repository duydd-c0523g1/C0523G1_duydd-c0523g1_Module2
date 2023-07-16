package mvc_practice.service;

import mvc_practice.model.Customer;

import java.util.ArrayList;

import java.util.ArrayList;

public interface IClientsService {
    void addCustomer(Customer customer);

    void removeCustomerById(int id);

    ArrayList<Customer> searchCustomerByName(String name);

    void showCustomerList();
}


