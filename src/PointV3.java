public class PointV3 {
    private int x; //States fields for point class
    private int y;

    public PointV3(int initialX, int initalY) {
        x = initialX;
        y = initalY;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public double distance(PointV3 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public int getx() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


}
