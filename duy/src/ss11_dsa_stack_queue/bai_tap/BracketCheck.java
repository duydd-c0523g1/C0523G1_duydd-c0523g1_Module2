package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức cần kiểm tra:");
        String equation = scanner.nextLine();
        char[] charArray = equation.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        Stack<Character> bStack = new Stack<>();
        for (char c : charArray) {
            if (c == '(') {
                bStack.push(c);
            } else if (c == ')') {
                if (bStack.empty()) {
                    System.out.println(" Not good");
                    break;
                }else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) {
            System.out.println(" Good");
        }else {
            System.out.println(" Not good");
        }
    }
}
