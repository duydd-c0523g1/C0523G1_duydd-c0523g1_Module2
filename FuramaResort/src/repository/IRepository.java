package repository;

import model.person.employee.Employee;

import java.util.ArrayList;

public interface IRepository<T> {
    ArrayList<T> displayList();
    void addNew(T t);
    void edit(String id, T t);
    void delete(int id);

}
