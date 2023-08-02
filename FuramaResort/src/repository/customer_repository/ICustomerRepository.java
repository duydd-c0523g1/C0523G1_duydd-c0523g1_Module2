package repository.customer_repository;

import model.person.customer.Customer;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    List<Customer> searchByName(String name);
}
