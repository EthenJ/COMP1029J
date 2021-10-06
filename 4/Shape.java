/**
 * This class describes a basic shape.
 */

public class Shape
{
    // Store the position of the shape
    double x, y;

    // The constructor of a shape
    public Shape(double x, double y) {
        // 'this' refers to the object itself
        // 'this.x' means the x attribute of the object
        // while 'x' means the input parameter of the constructor
        this.x = x;
        this.y = y;
    }

    // Return the x position of the shape
    public double getPosX() {
        return x;
    }

    // Return the y position of the shape
    public double getPosY() {
        return y;
    }

    // Return the area of the shape
    public double getArea() {
        // Since the shape does not have a physical attribute,
        // the area is 0
        return 0;
    }

    // Return the circumference of the shape
    public double getCircumference() {
        // Since the shape does not have a physical attribute,
        // the circumference is 0
        return 0;
    }
}
