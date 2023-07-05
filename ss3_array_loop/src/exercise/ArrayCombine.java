package exercise;

import java.util.ArrayList;

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
        System.out.println("Mảng đã gộp:");
        for (Integer integer : combinedArray) {
            System.out.print(integer + ", ");
        }
    }
}
