package Recursion;

public class ReverseANum {
    static int sum = 0;

    static int rev(int n){
        if(n==0) return sum;
        sum=sum*10+n%10;
        return rev(n/10);
    }
    public static void main(String[] args) {
        System.out.println(rev(1824));
    }
    
}
