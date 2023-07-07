package ss4_class_object.bai_tap.bai_2_stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Khởi tạo mảng random 0 -> 100000
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        //Tạo đối tượng StopWatch
        StopWatch stopWatch = new StopWatch();
        //Tạo function selection sort
        selectionSort(arr); //Gọi hàm selectionSort
        //Dừng đồng hồ và cho ra kết quả
        stopWatch.stop();
        System.out.println("Thời gian thực hiện thuật toán: " + stopWatch.getElapsedTime() + "ms");
    }

    //Tạo function selectionSort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = arr[j];
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
