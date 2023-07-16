package mvc_practice.view;

import mvc_practice.model.Clients;

import java.util.ArrayList;

public class ClientsView {
    public void displayCustomerList(ArrayList<Clients> clientsList) {
        System.out.println("Customer List:");
        for (Clients clients : clientsList) {
            System.out.println(clients.toString());
        }
    }
}