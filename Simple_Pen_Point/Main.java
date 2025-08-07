
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        p1.add(p2);
        Point a = new Point(1, 2);
        Point b = new Point(1, 3);

        Pen pen = new Pen();

        pen.MoveTo(p1);
        pen.LineTo(p2);

        a.equals(b);

        if (a.equals(b)) {
            System.out.println("Points a and b are in same location.");
        } else {
            System.out.println("Points are in different location.");
        }
        System.out.println("Distance from origin: " + p1.distanceFromOrigin());
        System.out.println("distance: " + p1.distance(p2));

        Point c1 = new Point(4, 8);
        Point c2 = c1.copy();
        c2.setxy(100, 200); // this line is for checking either c1 updates his value or not ===> ans: is not
                            // b/c we made "copy" named method.
        System.out.println("Orignal: " + c1);
        System.out.println("Copy: " + c2);

        c2.setxy(100, 200);

        pen.showHistory();

    }
}
