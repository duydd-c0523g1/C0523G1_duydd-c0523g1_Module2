package model.booking;

import model.person.customer.Customer;

import java.time.LocalDate;

public class Booking extends Service {
    private LocalDate bookingDate;
    private LocalDate bookingDateStart;
    private LocalDate bookingDateEnd;
    private String customerID; //Cái này đã khai báo ở Class Customer rồi
}
