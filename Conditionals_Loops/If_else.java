package Conditionals_Loops;
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary:");
        int salary = input.nextInt();
        if (salary<1000) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        input.close();
    }
}
