package ss11_dsa_stack_queue.bai_tap;

import java.util.Arrays;

import java.util.Stack;

public class ReverseElements {

    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray));
        Stack<Integer> intStack = new Stack<>();
        for (int j : intArray) {
            intStack.push(j);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intStack.pop() + " ");
        }
    }
}
