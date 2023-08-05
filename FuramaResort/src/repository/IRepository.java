package repository;

import model.facility.Facility;

import java.util.Map;

public interface IRepository<T> {
    Map<Facility, Integer> displayList();
    void addNew(T t);
    void edit(String id, T t);
    void delete(String id);

}
