package simulatorClasses;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addExitActionListener(event -> System.exit(0));
        frame.addAboutActionListener(event -> JOptionPane.showMessageDialog(frame, "A car simulator. Made by Chloe Harrison."));
    }
}