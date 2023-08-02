package repository.booking_repository;

import model.booking.Booking;
import model.person.customer.Customer;
import model.person.employee.Employee;
import utils.Stream;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {
    private final String BOOKING_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\booking.csv";

    @Override
    public void displayContractList() {

    }

    @Override
    public void editContract() {

    }

    @Override
    public ArrayList<Booking> displayList() {
        ArrayList<Booking> bookingList = new ArrayList<>();
        List<String> stringList = Stream.read(BOOKING_PATH);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Booking booking = new Booking(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
            bookingList.add(booking);
        }
        return bookingList;
    }

    @Override
    public void addNew(Booking booking) {
        ArrayList<Booking> bookingList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        bookingList.add(booking);
        for (int i = 0; i < bookingList.size(); i++) {
            stringList.add(bookingList.get(i).getInfoToCsv());
        }
        Stream.write(BOOKING_PATH, stringList, true);
    }

    @Override
    public void edit(Booking booking) {

    }

    @Override
    public void edit(String id) {
        ArrayList<Booking> bookingList = this.displayList();
        ArrayList<String> stringList = new ArrayList<>();
        for (Booking b : bookingList) {
            if (b.getBookingNumber().equals(id)) {
                System.out.println("Nhập mã hợp đồng mới");
            }
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(String id) {

    }
}
