package ss13_searching_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo một mảng bất kì với các giá trị được nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array); // Bước 2: Sắp xếp mảng theo thứ tự tăng dần
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int index = binarySearch(array, 0, n - 1, value); // Bước 3: Gọi hàm tìm kiếm nhị phân đệ quy
        if (index != -1) {
            System.out.println("Tìm thấy giá trị " + value + " tại vị trí " + index + " trong mảng.");
        } else {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        // Bước 4: Tìm trung điểm (middle) của mảng con được xem xét
        int middle = (left + right) / 2;
        // Bước 5: Nếu giá trị ở vị trí trung điểm bằng với giá trị cần tìm, trả về vị trí trung điểm
        if (array[middle] == value) {
            return middle;
        }
        // Bước 6: Nếu giá trị cần tìm lớn hơn giá trị ở vị trí trung điểm, tiếp tục tìm kiếm bên phải
        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        }
        // Bước 7: Nếu giá trị cần tìm nhỏ hơn giá trị ở vị trí trung điểm, tiếp tục tìm kiếm bên trái
        return binarySearch(array, left, middle - 1, value);
    }
}
