package CH10_ArrayList;

public class CircleV1 implements ShapeV1 {

    private double radius;

    public CircleV1(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle - Area: " + area() + ", Perimeter: " + perimeter();
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
