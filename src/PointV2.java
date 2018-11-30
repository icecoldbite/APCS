public class PointV2 {
    public int x; //States fields for point class
    public int y;

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public double distance(PointV2 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


}
