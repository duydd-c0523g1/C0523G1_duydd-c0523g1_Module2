package exercise;

import java.util.Scanner;

public class ElementMax_2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        // Khởi tạo ma trận và nhập giá trị từng phần tử
        double[][] matrix = new double[rows][columns];
        System.out.println("Nhập giá trị cho từng phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho phần tử (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất và tọa độ của nó
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxValue);
        System.out.println("Tọa độ của phần tử lớn nhất là: (" + maxRow + ", " + maxColumn + ")");

        scanner.close();
    }
}

