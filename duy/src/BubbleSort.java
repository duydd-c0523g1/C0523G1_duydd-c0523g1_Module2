public class BubbleSort {
    public static int[] sort(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }
        return arr;
    }
}
