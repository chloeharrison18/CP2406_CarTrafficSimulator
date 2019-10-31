package simulatorClasses;

import javax.swing.*;

class FrameTest {
    public static void main(String[] args) {
        // Test running the frame.
        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addExit(event -> System.exit(0));
        frame.addAbout(event -> JOptionPane.showMessageDialog(frame, "A car simulator. Made by Chloe Harrison."));
    }
}