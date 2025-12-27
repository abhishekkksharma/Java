package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,10,11};
        System.out.println(Search(arr, 101, 0, arr.length-1));
        
    }
    static int Search(int[] arr, int target, int start, int end){
        if(start>end) return -1;
        int mid = end - (end-start)/2;
        if(arr[mid]==target) return mid;
        if(target<arr[mid]){
            return Search(arr, target, start, end-1);
        }
        return Search(arr, target, mid+1, end);
    }
}
