import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("USD: ");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println(usd + " USD = " + convert + "VND");
    }
}