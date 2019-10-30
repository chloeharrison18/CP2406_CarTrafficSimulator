package simulatorClasses;

import javax.swing.*;
import java.awt.*;

public class CarRectangle extends JPanel {
    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int x = 200;
        int y = 200;
        final int WIDTH = 80, HEIGHT = 80;
        gr.setColor(Color.RED);
        gr.fillRect(x, y, WIDTH, HEIGHT);
    }
}
