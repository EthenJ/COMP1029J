/**
 * This class describes the name of a student.
 */

public class StudentName implements Printable
{
    // Store the name of the student
    String firstname;
    String lastname;

    // The constructor of a student name
    public StudentName(String newfirstname, String newlastname) {
        firstname = newfirstname;
        lastname = newlastname;
    }

    // The method of the Printable interface
    public void print() {
        System.out.print(lastname + ", " + firstname);
    }
}
