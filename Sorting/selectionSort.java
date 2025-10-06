package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
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

    static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_idx]) min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
