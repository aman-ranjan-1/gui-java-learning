// learning and understanding Swing Painting and Custom Painting

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

// Custom panel for painting
class CustomPaintcomponent extends JPanel {

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a blue rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        // Draw a red circle
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100);
    }
}

// Custom Look and Feel class
class CustomLookAndFeel {
    public static void setCustomLookAndFeel() {
        try {
            // Works on Linux, Windows, Mac
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("LookAndFeel Error: " + e.getMessage());
        }
    }
}

// Main class
public class SwingPainting {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // Set Look and Feel
            CustomLookAndFeel.setCustomLookAndFeel();

            // Create frame
            JFrame frame = new JFrame("Swing Paint Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);

            // Add custom panel
            CustomPaintcomponent custompaint = new CustomPaintcomponent();
            frame.add(custompaint);

            // Make visible
            frame.setVisible(true);
        });
    }
}