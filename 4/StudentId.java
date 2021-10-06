/**
 * This class describes a student id.
 */

public class StudentId implements Printable
{
    // Store the id of the student
    String id;

    // The constructor of a student id 
    public StudentId(String newid) {
        id = newid;
    }

    // The method of the Printable interface
    public void print() {
        System.out.print(id);
    }
}
