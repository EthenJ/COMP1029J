/**
 * This program shows the grade of a score entered by the user.
 */
import java.util.Scanner;

public class PrintGradeUsingIf
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

        // Print the grade based on the score
        System.out.print("Your grade is: ");
        
        // Handle the A grade
        if (score >= 80) {
            System.out.println("A");
        }
        
        // Handle the B grade
        if (score >= 60 && score < 80) {
            System.out.println("B");
        }
        
        // Handle the C grade
        if (score >= 40 && score < 60) {
            System.out.println("C");
        }
        
        // Handle the D grade
        if (score < 40) {
            System.out.println("D");
        }
    }
}
