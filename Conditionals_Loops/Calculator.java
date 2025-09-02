package Conditionals_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter a operator:");
            char op = input.next().trim().charAt(0);
            if (op=='+' || op =='-' ||op=='*' ||op=='/' || op=='%') {
                System.out.print("Enter two numbers:");
                int num1= input.nextInt();
                int num2= input.nextInt();
                if (op=='+') {
                    System.out.println(num1+num2);
                }
                else if( op=='-'){
                    System.out.println(num1-num2);
                }
                else if( op=='*'){
                    System.out.println(num1*num2);
                }
                else if( op=='/' ){
                    if (num2!=0) {
                        System.out.println(num1/num2);
                    }
                }
                else if(op=='%')
                {
                    System.out.println(num1%num2);
                }
            }else if(op=='x'){
                break;
            }
            else{
                System.out.println("invalid input.");
            }

        }
        input.close();
    }
}
