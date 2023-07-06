package exercise;

import java.util.Scanner;

public class DiagonalLineSum2DArray {
    public static void main(String[] args) {
        //Bước 1: Tạo ma trận vuông
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của ma trận vuông");
        int size = scanner.nextInt();

        //Bước 2: Tạo mảng 2 chiều dựa trên kích thước đã nhập
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j =  0; j < size; j++) {
                System.out.println("Nhập vào giá trị của hàng " + (i + 1) + " cột " + (j + 1));
                matrix[i][j] = scanner.nextInt();
            }
        }
        //In ra ma trận
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        //Tính tổng đường chéo
        int sumLR = 0;
        int sumRL = 0;
        for (int i = 0; i < size; i++) {
            sumLR += matrix[i][i];
            sumRL += matrix[i][size - 1 - i];
        }
        System.out.println("Tổng 2 đường chéo chính của ma trận là: " + (sumLR + sumRL));
    }
}
