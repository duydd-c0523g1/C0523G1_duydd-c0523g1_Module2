package repository.booking_repository;

import model.booking.Booking;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;

public interface IBookingRepository extends IRepository<Booking> {
    void displayContractList();
    void editContract();

    @Override
    ArrayList<Booking> displayList();

    @Override
    void addNew(Booking booking);

    @Override
    void edit(Booking booking);

    @Override
    void delete(int id);
}
