package bankmanagmentsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomTitleBarExample extends JFrame {

    private int mouseX, mouseY;

    public CustomTitleBarExample() {
        // Remove default decorations
        setUndecorated(true);

        // Set layout to BorderLayout
        setLayout(new BorderLayout());

        // Create the custom title bar
        JPanel titleBar = new JPanel();
        titleBar.setBackground(Color.BLUE); // Set the desired color
        titleBar.setPreferredSize(new Dimension(800, 30));
        titleBar.setLayout(new BorderLayout());

        // Create a label for the title text
        JLabel titleLabel = new JLabel("Custom Title Bar", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE); // Set text color
        titleBar.add(titleLabel, BorderLayout.CENTER);

        // Add a close button
        JButton closeButton = new JButton("X");
        closeButton.setForeground(Color.WHITE);
        closeButton.setBackground(Color.RED);
        closeButton.setFocusPainted(false);
        closeButton.setBorderPainted(false);
        closeButton.addActionListener(e -> System.exit(0));
        titleBar.add(closeButton, BorderLayout.EAST);

        // Add mouse listener for dragging the window
        titleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        titleBar.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - mouseX;
                int y = e.getYOnScreen() - mouseY;
                setLocation(x, y);
            }
        });

        // Add the custom title bar to the frame
        add(titleBar, BorderLayout.NORTH);

        // Add some content to the frame
        JTextArea textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Frame settings
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI creation in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new CustomTitleBarExample());
    }
}
