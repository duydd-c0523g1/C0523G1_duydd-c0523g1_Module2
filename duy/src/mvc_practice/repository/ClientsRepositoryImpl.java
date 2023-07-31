package mvc_practice.repository;

import mvc_practice.model.Clients;

import java.util.ArrayList;

public class ClientsRepositoryImpl implements IClientsRepository {
    private static ArrayList<Clients> clientsList = new ArrayList<>();

    @Override
    public ArrayList<Clients> findAll() {
        return clientsList;
    }

    @Override
    public void addCustomer(Clients clients) {
        clientsList.add(clients);
    }

    @Overrid2e
    public void removeCustomerById(int id) {
        clientsList.removeIf(customer -> customer.getId() == id);
    }

    @Override
    public ArrayList<Clients> searchCustomerByName(String name) {
        ArrayList<Clients> searchResult = new ArrayList<>();
        for (Clients clients : clientsList) {
            if (clients.getName().contains(name)) {
                searchResult.add(clients);
            }
        }
        return searchResult;
    }
}
