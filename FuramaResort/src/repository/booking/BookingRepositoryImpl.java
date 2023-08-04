package repository.booking;

import model.booking.Booking;
import utils.Stream;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {
    private final String BOOKING_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\FuramaResort\\src\\data\\booking.csv";
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
}
