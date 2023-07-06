package exercise;

import java.util.Scanner;

public class ColumnSum2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bước 1: Nhập số hàng và số cột của mảng
        System.out.println("Nhập số hàng của mảng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của mảng");
        int col = scanner.nextInt();

        //Bước 2: Khởi tạo mảng 2 chiều
        int[][] array = new int[row][col];
        System.out.println("Nhập giá trị cho từng phần tử trong mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị cho hàng " + (i + 1) + " cột " + (j + 1));
                array[i][j] = scanner.nextInt();
            }
        }
        // In ra các phần tử của mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //Bước 3: Tính tổng của cột được chọn
        System.out.println("Nhập số thứ tự cuả cột để tính tổng các phần tử của cột đó");
        int colSum = scanner.nextInt();
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < col; j++) {
                if (colSum == j) {
                    sum += ints[j];
                }
            }
        }
        System.out.println("Tổng các thành phần trong cột " + colSum + " là: " + sum);
    }
}