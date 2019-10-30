package simulatorClasses;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightRectangleTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TrafficLightRectangle());
        frame.setSize(430, 180);
        frame.setVisible(true);
    }
}