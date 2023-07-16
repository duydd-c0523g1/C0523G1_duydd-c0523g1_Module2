package mvc_practice.service;

import mvc_practice.model.Customer;
import mvc_practice.repository.ClientsRepositoryImpl;
import mvc_practice.repository.IClientsRepository;
import mvc_practice.view.ClientsView;

import java.util.ArrayList;

public class ClientsServiceImpl implements IClientsService {
    private IClientsRepository clientsRepository = new ClientsRepositoryImpl();
    private ClientsView clientsView = new ClientsView();

    @Override
    public void addCustomer(Customer customer) {
        clientsRepository.addCustomer(customer);
    }

    @Override
    public void removeCustomerById(int id) {
        clientsRepository.removeCustomerById(id);
    }

    @Override
    public ArrayList<Customer> searchCustomerByName(String name) {
        return clientsRepository.searchCustomerByName(name);
    }

    @Override
    public void showCustomerList() {
        clientsView.displayCustomerList(clientsRepository.findAll());
    }
}

