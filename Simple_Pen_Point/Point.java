import java.lang.Math;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setxy(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void add(Point other) {
        this.x = this.x + other.x;
        this.y = this.y + other.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point other) { // for camparing two points.
        return this.x == other.x && this.y == other.y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // This copy method is for making an object of Point but takes saperate memory.
    public Point copy() {
        return new Point(this.x, this.y);
    }

}
