package CH10_ArrayList;

public class RectangleV1 implements ShapeV1{

    private double width;
    private double length;

    public RectangleV1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle - Area: " + area() + ", Perimeter: " + perimeter();
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (2 * length) + (2 * width);
    }
}
