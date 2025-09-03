package Functions;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Sum is : "+(num1+num2));
        input.close();
    }
}
