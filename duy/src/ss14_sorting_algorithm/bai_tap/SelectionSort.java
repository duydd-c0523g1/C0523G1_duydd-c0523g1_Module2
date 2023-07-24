package ss14_sorting_algorithm.bai_tap;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minValue > arr[j]) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = minValue;
                arr[minIndex] = temp;
            }
        }
    }
}
