public class PointClientV2 {
    public static void main(String[] args) {
        PointV1 p1 = new PointV1(); //Creates a point at (0,0)
        PointV1 p2 = new PointV1();
        p2.setLocation(25, 25);
        System.out.println(p1.distance(p2));

    }




}
