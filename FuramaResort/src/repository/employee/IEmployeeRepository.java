package repository.employee;

import model.person.employee.Employee;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    List<Employee> searchByName(String name);
}
