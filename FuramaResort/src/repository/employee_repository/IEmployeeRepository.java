package repository.employee_repository;

import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    List<Employee> searchByName(String name);

    @Override
    ArrayList<Employee> displayList();

    @Override
    void addNew(Employee employee);


    void edit(String id);

    @Override
    void delete(int id);
}
