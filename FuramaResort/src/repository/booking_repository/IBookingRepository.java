package repository.booking_repository;

import model.booking.Booking;
import model.person.employee.Employee;
import repository.IRepository;

import java.util.ArrayList;

public interface IBookingRepository {
    ArrayList<Booking> displayList();
    void addNew(Booking booking);
}
