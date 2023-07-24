package ss14_sorting_algorithm.bai_tap;

public class InsertionSort {
    public static void sort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > currentElement; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
    }
}
