package Recursion.Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr, -1));
    }
    static boolean isSorted(int[] arr,int i){
        if(i<0){
            System.out.println("invalid index");
            return false;
        }
        if(i>=arr.length-1) return true;
        return arr[i]<arr[i+1] && isSorted(arr, i+1);
    }
}
