package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        //Bước 1: Khai báo và khởi tạo mảng
        int[] array = {1, 2, 3, 4, 5};

        //Bước 2: Nhập X là số cần chèn và vị trí cần chèn
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int elementToInsert = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int position = scanner.nextInt() - 1;

        //Bước 3: Tạo mảng mới với độ dài lớn hơn
        int[] newArray = new int[array.length + 1];

        //Bước 4: Sao chép các phần tử từ mảng ban đầu vào mảng mới và chèn phần tử mới
        if (position <= array.length) {
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    // Chèn phần tử mới
                    newArray[i] = elementToInsert;
                } else {
                    // Sao chép phần tử từ mảng ban đầu
                    newArray[i] = array[j];
                    j++;
                }
            }
            System.out.println("Mảng mới: " + Arrays.toString(newArray));
        }
        else {
            System.out.println("Vị trí không hợp lệ");
        }
    }
}

