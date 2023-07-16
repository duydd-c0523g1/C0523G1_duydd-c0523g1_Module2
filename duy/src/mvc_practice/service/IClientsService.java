package mvc_practice.service;

import mvc_practice.model.Clients;

import java.util.ArrayList;

public interface IClientsService {
    void addCustomer(Clients clients);

    void removeCustomerById(int id);

    ArrayList<Clients> searchCustomerByName(String name);

    void showCustomerList();
}


