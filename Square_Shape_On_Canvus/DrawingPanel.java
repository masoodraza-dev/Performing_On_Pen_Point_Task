import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class drawingPanel extends JPanel {
    private Pen pen;

    public drawingPanel(Pen pen) {
        this.pen = pen;
        setBackground(Color.WHITE); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK); 

        ArrayList<Line> path = pen.getPath();
        for (Line line : path) {
            g2.drawLine(
                    line.start.getx(), line.start.gety(),
                    line.end.getx(), line.end.gety());
        }
    }
}
