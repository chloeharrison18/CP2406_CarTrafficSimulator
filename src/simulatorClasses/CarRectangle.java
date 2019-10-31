package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class CarRectangle extends JPanel {
    private Timer timer;
    private final int WIDTH = 50, HEIGHT = 35;
    private int x;
    private int y;

    public CarRectangle(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.setColor(Color.RED);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }

    public void move() {
        timer = new Timer(1000, e -> {
            x += 10;
            repaint();
        });
        timer.start();
    }
}
