package CH10_ArrayList;


import java.util.ArrayList;


public class ShapeClientV2 {
    public static void main(String[] args) {

        ArrayList<ShapeV2> shapeList = new ArrayList<>();

        shapeList.add(new CircleV2(5));
        shapeList.add(new RectangleV2(5, 100));
        shapeList.add(new TriangleV2(3, 4, 5));

        printShapes(shapeList);


    }

    public static void printShapes(ArrayList<ShapeV2> shapes) {
        for(ShapeV2 shape : shapes) {
            System.out.println(shape);
        }
    }

    public boolean largerArea(ShapeV2 shape1, ShapeV2 shape2) {
        return shape1.compareTo(shape2) > 0;
    }
}
