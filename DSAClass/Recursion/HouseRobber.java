package DSAClass.Recursion;

import java.util.*;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxTheft(array, array.length-1, 0));
        sc.close();
    }

    static int maxTheft(int[] arr, int index, int result){
        if(index<0){
            return result;
        }
        int include = maxTheft(arr, index-2, result+arr[index]);
        int exclude = maxTheft(arr, index-1, result);

        return Integer.max(include, exclude);
    }
}