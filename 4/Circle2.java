/**
 * This class describes a circle shape.
 */

public class Circle2 extends Shape
{
    // Store the radius of the circle
    double radius;

    // The constructor of a circle
    public Circle2(double x, double y, double radius) {
        // 'super' denotes the constructor of the base class, i.e.
        // Shape(double x, double y) in the Shape class
        super(x, y);
        this.radius = radius;
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
