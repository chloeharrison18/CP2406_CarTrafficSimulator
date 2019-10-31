package simulatorClasses;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightRectangleTest {
    public static void main(String[] args) {
        // Test displaying the rectangle.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TrafficLightRectangle(100, 100));
        frame.setSize(430, 180);
        frame.setVisible(true);
    }
}