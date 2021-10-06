/**
 * This class describes a square shape.
 */

public class Square2 extends Shape
{
    // Store the length of the square
    double length;

    // The constructor of a square
    public Square2(double x, double y, double length) {
        // 'super' denotes the constructor of the base class, i.e.
        // Shape(double x, double y) in the Shape class
        super(x, y);
        this.length = length;
    }

    // Return the lenght of the side
    public double getLength() {
        return length;
    }

    // Return the area of the square
    public double getArea() {
        return length * length;
    }

    // Return the circumference of the square
    public double getCircumference() {
        return 4 * length;
    }
}
