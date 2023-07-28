package model.booking;

public abstract class Service {
    private String bookingID;
    public Service() {
    }

    public Service(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    @Override
    public String toString() {
        return "Service{" +
                "bookingID='" + bookingID + '\'' +
                '}';
    }
}
