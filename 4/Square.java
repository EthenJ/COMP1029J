/**
 * This class describes a square shape.
 */

public class Square
{
    // Store the position of the square
    double x, y;

    // Store the length of the square
    double length;

    // The constructor of a square
    public Square(double x, double y, double length) {
        // 'this' refers to the object itself
        // 'this.x' means the x attribute of the object
        // while 'x' means the input parameter of the constructor
        this.x = x;
        this.y = y;
        this.length = length;
    }

    // Return the x position of the square
    public double getPosX() {
        return x;
    }

    // Return the y position of the square
    public double getPosY() {
        return y;
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
