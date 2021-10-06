/**
 * This class describes a circle shape.
 */

public class Circle
{
    // Store the position of the circle
    double x, y;

    // Store the radius of the circle
    double radius;

    // The constructor of a circle
    public Circle(double x, double y, double radius) {
        // 'this' refers to the object itself
        // 'this.x' means the x attribute of the object
        // while 'x' means the input parameter of the constructor
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Return the x position of the circle
    public double getPosX() {
        return x;
    }

    // Return the y position of the circle
    public double getPosY() {
        return y;
    }

    // Return the radius of the side
    public double getRadius() {
        return radius;
    }

    // Return the area of the circle
    public double getArea() {
        return 3.1416 * radius * radius;
    }

    // Return the circumference of the circle
    public double getCircumference() {
        return 2 * 3.1416 * radius;
    }
}
