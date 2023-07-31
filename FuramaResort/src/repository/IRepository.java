package repository;

public interface IRepository<T> {
    void displayList();
    void addNew(T t);
    void edit(T t);
    void delete(int id);
}
