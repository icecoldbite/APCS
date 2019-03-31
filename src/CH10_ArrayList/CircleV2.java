package CH10_ArrayList;

public class CircleV2 extends ShapeV2 {

    private double radius;

    public CircleV2(double radius) {
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
