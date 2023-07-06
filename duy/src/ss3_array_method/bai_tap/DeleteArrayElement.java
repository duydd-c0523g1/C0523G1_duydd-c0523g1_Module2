package ss3_array_method.bai_tap;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng
        int[] array = {1, 2, 3, 4, 5};

        // Bước 2: Nhập phần tử cần xoá từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng:" + Arrays.toString(array));
        System.out.print("Nhập phần tử cần xoá: ");
        int elementToRemove = scanner.nextInt();

        // Bước 3: Tìm vị trí của phần tử cần xoá trong mảng
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToDelete = i;
                break;
            }
        }

        // Bước 4: Xoá phần tử khỏi mảng
        if (indexToDelete != -1) {                                      //Nếu số nhập vào tồn tại trong mảng
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            // Giảm kích thước của mảng đi 1
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;

            System.out.println("Phần tử đã được xoá khỏi mảng.");
        } else {
            System.out.println("Phần tử không tồn tại trong mảng.");
        }

        // Bước 5: In ra mảng sau khi xoá phần tử
        System.out.print("Mảng sau khi xoá phần tử: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
