package ss15_exception_handling.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập độ dài cạnh thứ nhất:");
            double side1 = scanner.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ hai:");
            double side2 = scanner.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ ba:");
            double side3 = scanner.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Ngoại lệ: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ngoại lệ không xác định: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
