package mvc_practice.service;

import mvc_practice.model.Clients;
import mvc_practice.repository.ClientsRepositoryImpl;
import mvc_practice.repository.IClientsRepository;
import mvc_practice.view.ClientsView;

import java.util.ArrayList;

public class ClientsServiceImpl implements IClientsService {
    private IClientsRepository clientsRepository = new ClientsRepositoryImpl();
    private ClientsView clientsView = new ClientsView();

    @Override
    public void addCustomer(Clients clients) {
        clientsRepository.addCustomer(clients);
    }

    @Override
    public void removeCustomerById(int id) {
        clientsRepository.removeCustomerById(id);
    }

    @Override
    public ArrayList<Clients> searchCustomerByName(String name) {
        return clientsRepository.searchCustomerByName(name);
    }

    @Override
    public void showCustomerList() {
        clientsView.displayCustomerList(clientsRepository.findAll());
    }
}
