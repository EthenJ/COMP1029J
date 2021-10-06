/**
 * This program shows the length of the name entered by the user.
 */
import java.util.Scanner;

public class LengthOfName
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Ask for the name
        System.out.print("What is your name? ");

        // Get the name input
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        // Show the length of the name
        System.out.println("Your name is " + name.length() + " characters long.");
    }
}
