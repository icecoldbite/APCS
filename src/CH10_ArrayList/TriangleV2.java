package CH10_ArrayList;

public class TriangleV2 extends ShapeV2{

    private double side1;
    private double side2;
    private double side3;

    public TriangleV2(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String toString() {
        return "Triangle - Area: " + area() + ", Perimeter: " + perimeter();
    }

    @Override
    public double area() {
        double s = (.5 * (perimeter()));
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
