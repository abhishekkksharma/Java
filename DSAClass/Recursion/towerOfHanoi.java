package DSAClass.Recursion;

public class towerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }
    public static void tower(int n, char source, char helper, char dest){
        if(n==0) return;
        tower(n-1, source, dest, helper);
        System.out.println(n+ " : "+source + " -> "+dest);
        tower(n-1, helper, source, dest);
    }

}
