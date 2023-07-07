package ss4_class_object.bai_tap.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình ax2 + bx + c = 0");
        System.out.println("Nhập giá trị a");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.getDiscriminant();
        System.out.println("Root 1 = " + equation.getRoot1());
        System.out.println("Root 2 = " + equation.getRoot2());
    }
}
