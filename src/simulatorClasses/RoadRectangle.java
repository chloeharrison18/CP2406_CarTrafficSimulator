package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class RoadRectangle extends JPanel {
    private final int WIDTH = 500, HEIGHT = 50;
    private int x;
    private int y;

    public RoadRectangle(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }
    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.setColor(Color.DARK_GRAY);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }
}
