package repository;

import model.person.employee.Employee;

import java.util.ArrayList;

public interface IRepository<T> {
    ArrayList<T> displayList();
    void addNew(T t);
    void edit(T t);

    void edit(String id);

    void delete(int id);

    void delete(String id);
}
