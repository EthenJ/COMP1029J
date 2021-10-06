/**
 * This is the first program in the Java bridging course.
 */
import java.util.*;
import java.io.*;
public class HelloWorld
{
    /**
     * The main method of the program.
     */

    public static void main(String[] args){
        boolean a=true;
        a=!a;
        System.out.println("What day is today?");

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.next());

        switch (   day%15   ) {
            case 0:
            System.out.println("Wolfman today");
            break;
            default  :
            System.out.println(a);
        }
    }
}
