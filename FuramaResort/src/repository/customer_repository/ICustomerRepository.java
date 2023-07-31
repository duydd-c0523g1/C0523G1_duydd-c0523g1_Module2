package repository.customer_repository;

import model.person.customer.Customer;
import repository.IRepository;

public interface ICustomerRepository extends IRepository<Customer> {
    void searchByName(String name);

    @Override
    void displayList();

    @Override
    void addNew(Customer customer);

    @Override
    void edit(Customer customer);

    @Override
    void delete(int id);
}
