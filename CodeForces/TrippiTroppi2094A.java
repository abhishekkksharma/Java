package CodeForces;

import java.util.Scanner;

public class TrippiTroppi2094A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            solution(line);
        }
        sc.close();
    }

    static void solution(String s){
        String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(0));
        }
        System.out.println();
    }
}
