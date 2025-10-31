package StacksAndQueues.Stack.Custom;

public class Main {
    public static void main (String[] args) throws StackExcepttion{
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

    }
}
