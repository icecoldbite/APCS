//ShapeV2 is an abstract class that includes two abstract methods in it, area and perimeter
//Any class that implements Shape is responsible for implementing its inherited area and perimeter methods
//ShapeV2 also implements the compareTo method from the Comparable interface

package CH10_ArrayList;

public abstract class ShapeV2 implements Comparable{
    public abstract double area();
    public abstract double perimeter();

    public int compareTo(Object other) {
        if(this.area() > ((ShapeV2)other).area()) {
            return 1;
        }

        else if(this.area() == ((ShapeV2)other).area()) {
            return 0;
        }

        else {
            return -1;
        }
    }
}
