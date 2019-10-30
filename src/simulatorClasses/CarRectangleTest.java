package simulatorClasses;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class CarRectangleTest {
    public static void main(String[] args) throws InterruptedException {
        // Set up variables
        int testingNum = 1;
        CarRectangle carRectangle = new CarRectangle(10, 10);
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(carRectangle);
        frame.setSize(1200, 800);
        frame.setVisible(true);

        // Test moving the rectangle
        while (testingNum != 10) {
            carRectangle.move();
            testingNum += 1;
            System.out.println("Car has moved.");
            Thread.sleep(1000);
        }
    }
}