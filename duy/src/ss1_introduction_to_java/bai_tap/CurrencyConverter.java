package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner input = new Scanner(System.in); //Nhận user input
        System.out.print("USD: ");
        double usd = input.nextDouble(); //Gán giá trị từ input vào biến usd
        double convert = usd * vnd;
        System.out.println(usd + " USD = " + convert + "VND");
    }
}