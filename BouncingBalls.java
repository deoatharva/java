import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BouncingBalls extends JPanel {

    Ball[] balls;

    public BouncingBalls() {
        balls = new Ball[5];
        Random random = new Random();
        for (int i = 0; i < balls.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            balls[i] = new Ball(color, this);
        }
        for (Ball ball : balls) {
            Thread thread = new Thread(ball);
            thread.start();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            ball.draw(g);
        }
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Bouncing Balls");
        BouncingBalls bouncingBalls = new BouncingBalls();
        frame.add(bouncingBalls);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

class Ball implements Runnable {
    Color color;
    int x, y, dx = 2, dy = 2;
    Random random = new Random();
    JPanel panel;

    public Ball(Color color, JPanel panel) {
        this.color = color;
        this.x = random.nextInt(380);
        this.y = random.nextInt(380);
        this.panel = panel;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 60, 60);
    }

    public void run() {
        while (true) {
            x += dx;
            y += dy;
            if (x <= 0 || x >= 400 - 30) {
                dx *= -1;
            }
            if (y <= 0 || y >= 400 - 30) {
                dy *= -1;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            panel.repaint();
        }
    }
}
