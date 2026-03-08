package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,9,3,10,4,8,7};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int s = low;
        int e=high;
        int mid =s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while (arr[s]<pivot) {
                s++;
            }
            while (arr[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        //now my pivot is at it's pos, now solve the two halves
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
