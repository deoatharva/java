import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RandomPixelApplet extends JApplet {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final Color DOT_COLOR = Color.RED;
    private static final int DOT_SIZE = 5;

    private Timer timer;

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
        for (Dot dot : dots) {
            g.setColor(DOT_COLOR);
            g.fillOval(dot.x, dot.y, DOT_SIZE, DOT_SIZE);
        }
    }

    private ArrayList<Dot> dots = new ArrayList<>();

    private void addDot() {
        // Generate random location for the dot
        int x = (int) (Math.random() * WIDTH);
        int y = (int) (Math.random() * HEIGHT);

        // Add the dot to the list
        dots.add(new Dot(x, y));

        // Repaint the applet to show the new dot
        repaint();
    }

    private static class Dot {
        int x, y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

