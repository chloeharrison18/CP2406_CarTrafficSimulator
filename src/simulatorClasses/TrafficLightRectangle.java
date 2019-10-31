package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class TrafficLightRectangle extends JPanel {
    private final int WIDTH = 30, HEIGHT = 60;
    private int x;
    private int y;

    public TrafficLightRectangle(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.setColor(Color.GRAY);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }
}
