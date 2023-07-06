package ss3_array_method.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCombine {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 0};
        int count = 0;
        ArrayList<Integer> combinedArray = new ArrayList<>();

        for (int i = 0; i < array1.length + array2.length; i++) {
            if (i <= array1.length - 1) {
                combinedArray.add(array1[i]);
            }
            else {
                combinedArray.add(array2[count]);
                count++;
            }
        }
        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));
        System.out.println("Mảng đã gộp:");
        System.out.print("[");
        for (Integer integer : combinedArray) {
            System.out.print(integer + ", ");
        }
        System.out.print("]");
    }
}
