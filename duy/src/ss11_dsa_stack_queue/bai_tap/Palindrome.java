package ss11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String inputString = "AtB";
        String stringToCheck = inputString.toLowerCase();
        char[] charArray = stringToCheck.toCharArray();
        System.out.println(Arrays.toString(charArray));
        Stack<Character> charStack = new Stack<>();
        Queue<Character> charQueue = new LinkedList<>();
        for (char c : charArray) {
            charStack.push(c);
            charQueue.offer(c);
        }
        boolean isPalindrome = false;
        for (int j = 0; j < charArray.length; j++) {
            if (charStack.pop() != charQueue.poll()) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        if (isPalindrome) {
            System.out.println("Chuỗi nhập vào là chuỗi Palindrome");
        }
        else {
            System.out.println("Chuỗi nhập vào không phải là chuỗi Palindrome");
        }
    }
}

