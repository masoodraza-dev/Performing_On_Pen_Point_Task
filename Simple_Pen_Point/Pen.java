import java.util.*;

public class Pen {
    private Point location;
    private ArrayList<String> pathHistory;

    public Pen() {
        location = new Point(0, 0);
        pathHistory = new ArrayList<>();
        pathHistory.add("Pen movements started at: " + location);
    }

    void MoveTo(Point newLocation) {
        location = newLocation;
        System.out.println("Pen moved to " + location);
        pathHistory.add("Pen moved to " + location);

    }

    public void LineTo(Point newLocation) {
        pathHistory.add("Line drawn from " + location + " To " + newLocation);
        System.out.println("Draw line from " + location + " To " + newLocation);
        location = newLocation;
    }

    public void showHistory() {
        System.out.println("<==== HISTORY OF PEN MOVEMENTS ====>");
        for (String moves : pathHistory) {
            System.out.println(moves);
        }
    }

    // method to draw square qo-ordinates
    public void drawSquare(int lineLength) {
        Point start = location;

        // first Start moves towards Right (x-axis) --> of line length 5, why 5 ?
        // because we are passing 5 in arguments in Main.java class
        Point p1 = new Point(location.getx() + lineLength, location.gety());
        LineTo(p1);

        Point p2 = new Point(p1.getx(), p1.gety() + lineLength);
        LineTo(p2);

        Point p3 = new Point(p2.getx() - lineLength, p2.gety());
        LineTo(p3);

        LineTo(start);
    }

    // this method is for rectangle and designed as like width = 2*height
    public void drawRectangle(int lineLength) {
        Point start = location;
        System.out.println("Rectangle through only one attribute:");

        Point p1 = new Point(location.getx() + lineLength + lineLength, location.gety());
        LineTo(p1);

        Point p2 = new Point(p1.getx(), p1.gety() + lineLength);
        LineTo(p2);

        Point p3 = new Point(p2.getx() - lineLength - lineLength, p2.gety());
        LineTo(p3);

        LineTo(start);

    }

    // Making this rectangle through giving two attributes are width and height
    public void drawRectangle2(int width, int height) {
        Point start = location;

        System.out.println("Making this is rectangle 2");

        Point p1 = new Point(location.getx() + width, location.gety());
        LineTo(p1);

        Point p2 = new Point(p1.getx(), p1.gety() + height);
        LineTo(p2);

        Point p3 = new Point(p2.getx() - width, p2.gety());
        LineTo(p3);

        LineTo(start);
    }

    public void drawTriangle(int sideLength) {
        Point start = location.copy();
        System.out.println("c-ordinates of Triangle:");

        Point p1 = new Point(start.getx() + sideLength, start.gety());
        LineTo(p1);

        int height = (int) (Math.sqrt(3) / 2 * sideLength);
        Point p2 = new Point(start.getx() + sideLength / 2, start.gety()); // this code drawing a line from Left corner
                                                                           // to up/height.
        // Point p2 = new Point(p1.getx() - sideLength / 2 , start.gety()); ---> this
        // code drawing a line from right corner to up/height.
        LineTo(p2);

        LineTo(start);
    }

}
