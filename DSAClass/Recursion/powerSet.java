package DSAClass.Recursion;

public class powerSet {
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        powerset(arr); 
    }

    static void powerset(char[] arr){
        int n = arr.length;

        for (int mask = 0; mask < (1 << n); mask++) {

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
