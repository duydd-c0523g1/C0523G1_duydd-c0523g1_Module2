package exercise;
import java.util.Scanner;
public class ArrayMinValue {
    public static void main(String[] args) {
        final int SIZE = 5; // Kích thước mảng (có thể thay đổi)

        int[] array = new int[SIZE];

        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất
        int minValue = array[0];
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Hiển thị giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}


