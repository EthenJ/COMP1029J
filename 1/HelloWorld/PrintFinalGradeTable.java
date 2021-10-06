/**
 * This is a program showing you printing the final grade summary based
 * on some variables.
 */
public class PrintFinalGradeTable
{
    /**
     * The main method of this program.
     */
    public static void main(String[] args)
    {
        // Declare the variables for the calculation
        double lab1, lab2, lab3, lab4, lab5, lab6;
        double labs;
        double midtermexam, finalexam, attendance;
        double finalgrade;

        // Initialize the scores of the labs, exams and attendance
        lab1 = 100;
        lab2 = 100;
        lab3 = 100;
        lab4 = 100;
        lab5 = 100;
        lab6 = 100;
        midtermexam = 80;
        finalexam = 75;
        attendance = 100;

        /* This statement calculates the lab average */
        labs = (lab1 + lab2 + lab3 + lab4 + lab5 + lab6) / 6.0;

        /* This statement calculates the final grade */
        finalgrade = labs        * 0.2 + // the labs contribute 20% of the final grade
                     midtermexam * 0.2 + // the midterm exam contributes 20% of the final grade
                     finalexam   * 0.5 + // the final exam contributes 50% of the final grade
                     attendance  * 0.1;  // the attendance record contributes 10% of the final grade

        /* Print the summary of the final grade calculation */
        System.out.print("Lab average\t");
        System.out.print(labs);
        System.out.println("\t(20%)");
        System.out.print("Midterm exam\t");
        System.out.print(midtermexam);
        System.out.println("\t(20%)");
        System.out.print("Final exam\t");
        System.out.print(finalexam);
        System.out.println("\t(50%)");
        System.out.print("Attendance\t");
        System.out.print(attendance);
        System.out.println("\t(10%)");
        System.out.println();
        System.out.print("Final grade\t");
        System.out.println(finalgrade);
    }
}
