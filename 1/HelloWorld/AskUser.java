/**
 * This is a program showing you getting the input from the user using Scanner.
 */

// Import Scanner from the java.util package
import java.util.Scanner;

public class AskUser
{
    /**
     * The main method of this program.
     */
    public static void main(String[] args)
    {
        // Create the scanner from the input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for his/her name
        System.out.print("What is your name? ");

        // Wait for the input and store it in the variable name
        String name = scanner.next();

        // Say hello to the user
        System.out.println("Hello, " + name + "!");
    }
}
