package repository.booking_repository;

import model.booking.Booking;
import repository.IRepository;

public interface IBookingRepository extends IRepository<Booking> {
    void displayContractList();
    void editContract();

    @Override
    void displayList();

    @Override
    void addNew(Booking booking);

    @Override
    void edit(Booking booking);

    @Override
    void delete(int id);
}
