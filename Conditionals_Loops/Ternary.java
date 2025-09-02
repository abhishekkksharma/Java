package Conditionals_Loops;
import java.util.Scanner;


public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        int max = a>b?a:b;
        int maxofthree = max>c?max:c;
        System.out.println(maxofthree);
        input.close();
    }
}
