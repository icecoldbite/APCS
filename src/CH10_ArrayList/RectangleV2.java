package CH10_ArrayList;

public class RectangleV2 extends ShapeV2{

    private double width;
    private double length;

    public RectangleV2(double width, double length) {
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
