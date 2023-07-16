package mvc_practice.view;

import mvc_practice.model.Customer;

import java.util.ArrayList;

public class ClientsView {
    public void displayCustomerList(ArrayList<Customer> customerList) {
        System.out.println("Customer List:");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}