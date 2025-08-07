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

    // this method is for rectangle and designed as like width= 2*height
    public void drawRectangle(int lineLength) {
        Point start = location;

        Point p1 = new Point(location.getx() + lineLength + lineLength, location.gety());
        LineTo(p1);

        Point p2 = new Point(p1.getx(), p1.gety() + lineLength);
        LineTo(p2);

        Point p3 = new Point(p2.getx() - lineLength - lineLength, p2.gety());
        LineTo(p3);

        LineTo(start);

    }
}
