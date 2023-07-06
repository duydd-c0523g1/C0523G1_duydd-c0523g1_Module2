package ss2_loop.bai_tap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        System.out.println("Các số nguyên tố:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
        scanner.close();
    }

    //Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
