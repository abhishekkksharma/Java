package Conditionals_Loops;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();
        int num=5;
        while (num>0) {
            System.out.println(num);
            num--;
        }
        System.out.println();
        int num2=5;
        do {
            System.out.println(num2);
            num2--;
        } while (num2>0);
    }
}
