package StacksAndQueues.Stack.Custom;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws StackExcepttion{
        Scanner sc = new Scanner(System.in);
        // CustomStack stack = new CustomStack(5);
        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(18);
        // stack.push(18); //Stack is full 

        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // System.out.println(stack.peek()); //18

        // System.out.println(stack.isEmpty()); //false

        DynamicStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(25); 
        stack.push(100); 

        System.out.println(stack.pop());

        CustomStack temp= new CustomStack(4);
        int n=sc.nextInt();
        while(n>0){
            temp.push(n%10);
            n/=10;
        }
        int res = 0;
        int place = 1;
        while (!temp.isEmpty()) {
            res += temp.pop() * place;
            place *= 10;
        }
        System.out.println(res);

    }
}
