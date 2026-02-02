package Sorting;

import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,5,7,1,2,6,4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int left, int right){
        if(left>=right) return;
        int mid = left + (right-left)/2;

        // First half
        sort(arr,left,mid);
        // Second half
        sort(arr, mid+1, right);

        //Finally merge the array
        merge(arr,left,mid,right);
    }
    private static void merge(int[] arr, int left, int mid, int right){
        int i = left;       
        int j = mid + 1;   
        int k = 0;         

        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }

       while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
    
}
