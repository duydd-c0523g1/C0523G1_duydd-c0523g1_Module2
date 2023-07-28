package model.person.customer;

import model.person.Person;

public class Customer extends Person {
    private String customerID;
    private String customerType;
    private String customerAddress;

    public Customer() {
    }

    public Customer(String name, String dob, String gender, String identificationNumber, String phoneNumber, String email, String customerID, String customerType, String customerAddress) {
        super(name, dob, gender, identificationNumber, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
