package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(40));
    }
    public static int fibo(int n){
        // base condition so the to stop calling the function
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
