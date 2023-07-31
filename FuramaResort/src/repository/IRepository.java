package repository;

import model.person.employee.Employee;

import java.util.ArrayList;

public interface IRepository<T> {
    ArrayList<Employee> displayList();
    void addNew(T t);
    void edit(T t);
    void delete(int id);
}
