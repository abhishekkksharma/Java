package Recursion;

public class numbers {
    public static void main(String[] args) {
        
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);;
            return;
        }
        System.out.println(n);
        //function calling itself
        print(n-1);
    }
}
