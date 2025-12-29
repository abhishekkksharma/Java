package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,8,1,9,0};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int j){
        if(j>=arr.length-1) return;
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        sort(arr,j+1);
    }
}
