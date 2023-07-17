package ss11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String inputString = "Able was I ere I saw Elba";
        String stringToCheck = inputString.toLowerCase();
        char[] charArray = stringToCheck.toCharArray();
        System.out.println(Arrays.toString(charArray));
        Stack<Character> charStack = new Stack<>();
        Queue<Character> charQueue = new LinkedList<>();
        for (char c : charArray) {
            charStack.push(c);
            charQueue.offer(c);
        }
        boolean status = false;
        for (int j = 0; j < charArray.length; j++) {
            if (charStack.pop() != charQueue.poll()) {
                status = false;
                break;
            } else {
                status = true;
            }
        }
        if (status) {
            System.out.println("Chuỗi nhập vào là chuỗi Palindrome");
        }
        else {
            System.out.println("Chuỗi nhập vào là không phải là chuỗi Palindrome");
        }
    }
}

