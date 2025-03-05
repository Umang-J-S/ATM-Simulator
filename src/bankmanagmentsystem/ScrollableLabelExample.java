package bankmanagmentsystem;

import javax.swing.*;
import java.awt.*;

public class ScrollableLabelExample extends JFrame {
    ScrollableLabelExample() {

        // Create a JLabel with a long text or large content
        JLabel mini = new JLabel("<html>This is Scroller Bar.</html>");

        // Set a preferred size for the JLabel that is larger than the frame size to
        // ensure scrolling
        mini.setPreferredSize(new Dimension(800, 1200));

        // Wrap the JLabel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(mini);

        // Add the scroll pane to the frame
        getContentPane().add(scrollPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocation(20, 20);
        setResizable(false);
        // getContentPane().add(scrollPane);
        getContentPane().setBackground(Color.white);
        setVisible(true);

        // Make the frame visible
        // setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame
        // JFrame frame = new JFrame("Scrollable JLabel Example");
        new ScrollableLabelExample();
    }
}
