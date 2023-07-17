package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển sang hệ nhị phân: ");
        int number = scanner.nextInt();
        Stack<Integer> binaryStack = new Stack<>();
        int binary;
        System.out.println("Dạng nhị phân của " + number + " là:");
        do {
            binary = (number % 2);
            number = (number / 2);
            binaryStack.push(binary);
        } while (number % 2 != 0);
        while (!binaryStack.empty()) {
            System.out.print(binaryStack.pop());
        }
    }
}
