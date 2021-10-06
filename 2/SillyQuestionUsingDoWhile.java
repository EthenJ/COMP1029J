/**
 * This program shows the use of a do while loop in a silly question which
 * forces the user to answer 'Y'.
 */
import java.util.Scanner;

public class SillyQuestionUsingDoWhile
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Prepare to Ask for the answer
        String answer;
        Scanner scanner = new Scanner(System.in);

        // Keep asking the question if the answer is not 'Y'
        do {
            // Show the question
            System.out.println("I am handsome. Do you agree?");
            System.out.print("Answer (Y/N): ");

            // Ask for the answer
            answer = scanner.next();
        } while (!answer.equals("Y"));

        System.out.println("That's right!");
    }
}
