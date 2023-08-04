package repository.booking;

import model.booking.Booking;

import java.util.ArrayList;

public interface IBookingRepository {
    ArrayList<Booking> displayList();
    void addNew(Booking booking);
}
