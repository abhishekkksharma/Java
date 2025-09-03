package Shadowing;

public class Shadowing {
    static int x=90; // when we reinitialize x in main this x will be shadowed(not used)
    public static void main(String[] args) {
        System.err.println(x); //90
        int x=40; //overriding
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x); //90
    }
}
