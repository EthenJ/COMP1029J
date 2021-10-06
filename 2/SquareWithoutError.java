/**
 * This program calculates the square of a number entered by the user.
 */
import java.util.Scanner;

public class SquareWithoutError
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Ask for a number
        System.out.print("Please give me a number: ");

        // Get the input using a scanner
        String number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.next();

        // Convert the string input to an integer
        int integer_number = Integer.parseInt(number);

        // Calculate the square of the number
        int square;
        square = integer_number * integer_number;

        // Show the number
        System.out.print("The square of the number is: ");
        System.out.println(square);
    }
}
