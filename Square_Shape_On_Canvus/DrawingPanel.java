import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class drawingPanel extends JPanel {
    private Pen pen;

    public DrawingPanel(Pen pen) {
        this.pen = pen;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ArrayList<Point> path = pen.getPath();
        g.setColor(Color.BLACK);

        for (int i = 0; i < path.size() - 1; i++) {
            Point p1 = path.get(i);
            Point p2 = path.get(i + 1);
            g.drawLine(p1.getx(), p1.gety(), p2.getx(), p2.gety());
        }
    }

}
