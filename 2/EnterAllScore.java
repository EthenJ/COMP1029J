/**
 * This program shows a congratulatory message when the entered score is
 * higher than 80.
 */
import java.util.Scanner;

public class EnterAllScore
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Get the total score
        String inputscore;
        System.out.print("What is the total score of your course? ");
        Scanner scanner = new Scanner(System.in);
        inputscore = scanner.next();

        // Convert the score to a number
        int score = Integer.parseInt(inputscore);

        // Print a message based on the score value
        if (score > 80) {
            System.out.println("Excellent! You have done a great job!");
        }
        else {
            System.out.println("Good job! You can do better next time!");
        }
    }
}
