package model.booking;

import java.time.LocalDate;

public class Contract {
    private String bookingNumber;
    private LocalDate bookingDate;
    private LocalDate startRentingFrom;
    private LocalDate endRenting;
    private String customerID;
    private String serviceID;
    public Contract() {
    }

    public Contract(String bookingNumber, LocalDate bookingDate, LocalDate startRentingFrom, LocalDate endRenting, String customerID, String serviceID) {
        this.bookingNumber = bookingNumber;
        this.bookingDate = bookingDate;
        this.startRentingFrom = startRentingFrom;
        this.endRenting = endRenting;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "bookingNumber='" + bookingNumber + '\'' +
                ", bookingDate=" + bookingDate +
                ", startRentingFrom=" + startRentingFrom +
                ", endRenting=" + endRenting +
                ", customerID='" + customerID + '\'' +
                ", serviceID='" + serviceID + '\'' +
                '}';
    }
}
