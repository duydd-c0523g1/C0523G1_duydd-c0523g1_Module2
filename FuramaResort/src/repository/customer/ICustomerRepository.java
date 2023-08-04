package repository.customer;

import model.person.customer.Customer;
import repository.IRepository;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    List<Customer> searchByName(String name);
}
