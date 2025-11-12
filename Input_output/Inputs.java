package Input_output;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Please Enter you roll Number:");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number is: "+rollno);\

        String name  = input.nextLine();
        System.out.println(name);
        // char ch = input.next();

        float marks =  input.nextFloat();
        System.out.println(marks);
        input.close();
    }
}
