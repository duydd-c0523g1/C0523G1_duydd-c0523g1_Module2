package repository.employee_repository;

import model.person.employee.Employee;
import repository.IRepository;

public interface IEmployeeRepository extends IRepository<Employee> {
    void searchByName(String name);

    @Override
    void displayList();

    @Override
    void addNew(Employee employee);

    @Override
    void edit(Employee employee);

    @Override
    void delete(int id);
}
