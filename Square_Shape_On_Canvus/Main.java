import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();

        pen.MoveTo(new Point(250, 250));
        pen.drawSquare(150);

        JFrame frame = new JFrame("Pen Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        drawingPanel panel1 = new drawingPanel(pen);
        frame.add(panel1);

        frame.setVisible(true);

    }
}
