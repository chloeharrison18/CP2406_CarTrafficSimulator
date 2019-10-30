package simulatorClasses;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class CarRectangleTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CarRectangle());
        frame.setSize(430, 180);
        frame.setVisible(true);
    }
}