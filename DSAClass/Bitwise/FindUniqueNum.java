package DSAClass.Bitwise;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt((Integer::parseInt)).toArray();
        int unpaired=0;
        for(int num:arr){
            unpaired^=num;
        }
        System.out.println(unpaired);
        sc.close();
    }
}
