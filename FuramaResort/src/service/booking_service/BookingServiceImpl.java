package service.booking_service;

import model.booking.Booking;
import repository.booking_repository.BookingRepositoryImpl;
import repository.booking_repository.IBookingRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    private static IBookingRepository bookingRepository = new BookingRepositoryImpl();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void displayList() {
        bookingRepository.displayList();
    }

    @Override
    public void addNew() {
        System.out.println("Nhập số hợp đồng");
        String contractNumber = scanner.nextLine();
        System.out.println("Nhập số booking");
        String bookingtNumber = scanner.nextLine();
        System.out.println("Nhập số tiền cọc trước");
        int prepaidFee = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tổng tiền");
        int totalFee = Integer.parseInt(scanner.nextLine());
        Booking booking = new Booking(contractNumber, bookingtNumber, prepaidFee, totalFee);
        bookingRepository.addNew(booking);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayContractList() {

    }

    @Override
    public void editContract() {

    }
}
