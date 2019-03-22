package CH10_ArrayList;


import java.util.ArrayList;


public class ShapeClientV1 {
    public static void main(String[] args) {

        ArrayList<ShapeV1> shapeList = new ArrayList<>();

        shapeList.add(new CircleV1(5));
        shapeList.add(new RectangleV1(5, 100));
        shapeList.add(new TriangleV1(3, 4, 5));

        printShapes(shapeList);


    }

    public static void printShapes(ArrayList<ShapeV1> shapes) {
        for(ShapeV1 shape : shapes) {
            System.out.println(shape);
        }
    }
}
