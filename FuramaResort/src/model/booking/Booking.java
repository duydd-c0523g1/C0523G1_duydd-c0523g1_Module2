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

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getPrepaidFee() {
        return prepaidFee;
    }

    public void setPrepaidFee(int prepaidFee) {
        this.prepaidFee = prepaidFee;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }
    public String getInfoToCsv() {
        return this.contractNumber + "," + this.bookingNumber + "," + this.prepaidFee + "," + this.totalFee;
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
