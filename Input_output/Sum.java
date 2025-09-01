package Input_output;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        System.out.println(num1+num2);
        input.close();
    }
}
