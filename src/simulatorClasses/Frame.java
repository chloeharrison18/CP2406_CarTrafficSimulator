package simulatorClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    private JMenuItem upload;
    private JMenuItem about;
    private JMenuItem exit;

    Frame() {
        super("Car Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(help);

        upload = new JMenuItem("Upload City");
        about = new JMenuItem("About");
        exit = new JMenuItem("Exit");

        file.add(exit);
        file.add(upload);
        help.add(about);

        setJMenuBar(menuBar);
        pack();

        setPreferredSize(new Dimension(1000,600));
        setBackground(Color.WHITE);

        Timer timer = new Timer(1, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        repaint();
    }

    void addExitActionListener(ActionListener listener) {
        exit.addActionListener(listener);
    }

    void addAboutActionListener(ActionListener listener) {
        about.addActionListener(listener);
    }

}
