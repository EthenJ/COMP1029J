/**
 * This program shows the route of the route number the user enters.
 */
import java.util.Scanner;

public class ShowRouteUsingIf
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Get the route number
        System.out.println("HKUST routes: 91, 91M, 792");
        System.out.println();
        System.out.print("Please enter the route you want to know: ");
        String number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.next();
        
        // Show the information of route 91
        if (number.equals("91")) {
            System.out.println("Clear Water Bay <> HKUST <> Diamond Hill");
        }
        // Show the information of route 91M
        else if (number.equals("91M")) {
            System.out.println("Po Lam <> HKUST <> Diamond Hill");
        }
        // Show the information of route 792
        else if (number.equals("792")) {
            System.out.println("Sai Kung <> HKUST <> Tseung Kwan O");
        }
        // No such route
        else {
            System.out.println("Bus route does not exist");
        }
    }
}
