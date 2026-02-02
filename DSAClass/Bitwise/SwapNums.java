package DSAClass.Bitwise;

import java.util.Arrays;

public class SwapNums {
    public static void main(String[] args) {
        int[] arr = {1,2};
        swap4(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("7 << 3 = "+ (7<<3));
        System.out.println("-7 << 3 = "+ (-7<<3));
        System.out.println("7 >> 3 = "+ (7>>3));
        System.out.println("-7 >> 3 = "+ (-7>>3));
        System.out.println("7 >>> 3 = "+ (7>>>3));
        System.out.println("-7 >>> 3 = "+ (-7>>>3));
    }

    //using temp variable
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
    // using +,-
    static void swap2(int[] arr){
        arr[0]=arr[0]+arr[1];
        arr[1]=arr[0]-arr[1];
        arr[0]=arr[0]-arr[1];
    }
    //using xor
    static void swap3(int[] arr){
        arr[0]=arr[0]^arr[1];
        arr[1]=arr[0]^arr[1];
        arr[0]=arr[0]^arr[1];
    }
    //oneline swaping
    static void swap4(int[] arr){
        arr[0]=(arr[0]+arr[1]) - (arr[1]=arr[0]);
    }

}
