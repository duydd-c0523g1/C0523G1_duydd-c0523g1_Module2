package mvc_practice.repository;

import mvc_practice.model.Clients;

import java.util.ArrayList;

public interface IClientsRepository {
    ArrayList<Clients> findAll();

    void addCustomer(Clients clients);

    void removeCustomerById(int id);

    ArrayList<Clients> searchCustomerByName(String name);
}
