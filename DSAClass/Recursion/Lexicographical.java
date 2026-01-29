package DSAClass.Recursion;

import java.util.Scanner;

public class Lexicographical {
    public static void recurse(int N, int current){
        if (current > N) return;

        if (current != 0) System.out.print(current + " ");

        for (int i = 0; i <= 9; i++) {
            if (current == 0 && i == 0) continue; // avoid leading zero
            recurse(N, current * 10 + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        recurse(N, 0);
        sc.close();
    }
}
