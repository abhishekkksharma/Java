package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,8,1,9,0};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int n) {
        if (n == 0) return;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubble(arr, n - 1);
    }
}
