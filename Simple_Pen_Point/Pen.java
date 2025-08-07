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
}
