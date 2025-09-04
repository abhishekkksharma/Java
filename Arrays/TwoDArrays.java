import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        // int[][] matrix = new int[3][];
        // int[][] arr2d = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        Scanner input = new Scanner(System.in); 
        int[][] arr =new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
