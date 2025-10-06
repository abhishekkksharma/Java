package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new  int[10];
        for(int i=0;i<10;i++){
            arr[i] = in.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
