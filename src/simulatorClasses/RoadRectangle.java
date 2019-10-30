package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class RoadRectangle extends JPanel {
    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int x = 200;
        int y = 200;
        final int WIDTH = 100, HEIGHT = 100;
        gr.setColor(Color.DARK_GRAY);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }
}
