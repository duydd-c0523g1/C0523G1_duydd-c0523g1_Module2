package ss14_sorting_algorithm.bai_tap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = {11, 5, 3, 4, 6};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}