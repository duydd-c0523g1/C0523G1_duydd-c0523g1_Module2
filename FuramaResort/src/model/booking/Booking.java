package model.booking;

public class Booking {
    private String contractNumber;
    private String bookingNumber;
    private int prepaidFee;
    private int totalFee;
    public Booking() {
    }

    public Booking(String contractNumber, String bookingNumber, int prepaidFee, int totalFee) {
        this.contractNumber = contractNumber;
        this.bookingNumber = bookingNumber;
        this.prepaidFee = prepaidFee;
        this.totalFee = totalFee;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingNumber='" + bookingNumber + '\'' +
                ", prepaidFee=" + prepaidFee +
                ", totalFee=" + totalFee +
                '}';
    }
}
