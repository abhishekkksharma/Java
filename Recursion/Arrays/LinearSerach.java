package Recursion.Arrays;

public class LinearSerach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(search(arr, 11, 0));
    }
    static int search(int[] arr, int target,int index){
        if(index>=arr.length-1) return -1;
        if(arr[index]==target) return index;
        return search(arr, target, index+1);
    }
}
