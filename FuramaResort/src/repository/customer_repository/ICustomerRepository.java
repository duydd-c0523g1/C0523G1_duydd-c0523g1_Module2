package repository.customer_repository;

import model.person.customer.Customer;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;

public interface ICustomerRepository extends IRepository<Customer> {
    void searchByName(String name);

    @Override
    ArrayList<Employee> displayList();

    @Override
    void addNew(Customer customer);

    @Override
    void edit(Customer customer);

    @Override
    void delete(int id);
}
