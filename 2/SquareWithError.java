/**
 * This program calculates the square of a number entered by the user.
 */
import java.util.Scanner;

public class SquareWithError
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

        // Calculate the square of the number
        int square;
        square = number * number;

        // Show the number
        System.out.print("The square of the number is: ");
        System.out.println(square);
    }
}
