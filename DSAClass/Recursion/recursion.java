package DSAClass.Recursion;

public class recursion {
    
    static void fun(int n){ //5 4 3 2 1 
        if(n==0) return;
        System.out.print(n+" ");
        fun(n-1);
    }
    static void fun2(int n){ //1 2 3 4 5
        if(n==0) return;
        fun2(n-1);
        System.out.print(n+" ");
    }

    //fibonacii 
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    // factorial 
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    static int pow(int n,int x){
        if(x<=1) return n;
        return n*pow(n, x-1);
    }

    static void print(int n){
        if(n<0) return;
        if(n/10!=0) print(n/10);
        System.out.println(n%10);
    }
    //recurrence relation 
    static void recurrence(int n){
        if(n>0){
            for(int i=1;i<n;i=i*2){
                System.out.println(n);
            }
            recurrence(n-1);
        }
    }
    public static void main(String[] args) {
        // fun(5);
        // System.out.println();
        // fun2(5);
        // System.out.println();
        // System.out.println("fibonacii of "+10+": "+fibo(10));
        // System.out.println("Factorial of 10: "+fact(10));
        // System.out.println("Pow 2^3: "+pow(2, 3));
        // print(323456);
        recurrence(3);
    }
}
