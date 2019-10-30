package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class TrafficLightRectangle extends JPanel {
    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int x = 200;
        int y = 100;
        final int WIDTH = 30, HEIGHT = 60;
        gr.setColor(Color.GRAY);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }
}
