import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt(); // Read the first integer from the user

        // Prompt the user to enter the second number
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt(); // Read the second integer from the user

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        input.close();
    }
}