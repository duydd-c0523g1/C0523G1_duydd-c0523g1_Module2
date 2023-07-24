package ss15_exception_handling.bai_tap;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập độ dài 3 cạnh của tam giác:");
            System.out.print("Cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Cạnh c: ");
            double c = scanner.nextDouble();
            // Kiểm tra các điều kiện của tam giác
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b) {
                throw new IllegalTriangleException("Các giá trị nhập vào không phải là cạnh của tam giác.");
            }
            // Tính diện tích tam giác sử dụng công thức Heron
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích của tam giác là: " + area);
        } catch (IllegalTriangleException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Lỗi không xác định: " + ex.getMessage());
        }
    }
}
