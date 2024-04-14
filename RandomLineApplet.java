import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RandomLineApplet extends JApplet {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final Color DOT_COLOR = Color.RED;
    private static final int DOT_SIZE = 5;

    private Timer timer;
    private ArrayList<Point> dots = new ArrayList<>();

    public void init() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);

        // Create and start timer to add dots every 200 milliseconds
        timer = new Timer(200, e -> addDot());
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw all dots
        for (int i = 0; i < dots.size(); i++) {
            Point dot = dots.get(i);
            g.setColor(DOT_COLOR);
            g.fillOval(dot.x, dot.y, DOT_SIZE, DOT_SIZE);

            // Draw line between current dot and previous dot (if exists)
            if (i > 0) {
                Point prevDot = dots.get(i - 1);
                g.drawLine(prevDot.x + DOT_SIZE / 2, prevDot.y + DOT_SIZE / 2, dot.x + DOT_SIZE / 2, dot.y + DOT_SIZE / 2);
            }
        }
    }

    private void addDot() {
        // Generate random location for the dot
        int x = (int) (Math.random() * WIDTH);
        int y = (int) (Math.random() * HEIGHT);

        // Add the dot to the list
        dots.add(new Point(x, y));

        // Repaint the applet to show the new dot and lines
        repaint();
    }
}

