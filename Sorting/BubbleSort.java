package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;
    }
}
