import java.awt.*;
import java.util.Random;

public class BouncingColour extends Frame implements Runnable {
    private int x, y;
    private Color color;
    private Thread t;
    private static final int MAX_X = 400;
    private static final int MAX_Y = 400;
    private static final int BALL_SIZE = 50;

    public BouncingColour(Color color) {
        this.color = color;
        setLayout(new FlowLayout());
        x = 20;
        y = 20;
        setBackground(Color.white);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            if (x >= MAX_X - BALL_SIZE || y >= MAX_Y - BALL_SIZE) {
                x = 20;
                y = 20;
            }
            x += 20;
            y += 20;

            repaint();
            try {
                t.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
        g.drawLine(0, 230, 200, 230);
        g.drawLine(200, 230, 210, 400);
    }

    public static void main(String args[]) {
        BouncingColour redBall = new BouncingColour(Color.RED);
        BouncingColour blueBall = new BouncingColour(Color.BLUE);
        BouncingColour greenBall = new BouncingColour(Color.GREEN);
        BouncingColour yellowBall = new BouncingColour(Color.YELLOW);
        BouncingColour orangeBall = new BouncingColour(Color.ORANGE);

        redBall.setSize(400, 400);
        redBall.setVisible(true);

        blueBall.setSize(400, 400);
        blueBall.setVisible(true);

        greenBall.setSize(400, 400);
        greenBall.setVisible(true);

        yellowBall.setSize(400, 400);
        yellowBall.setVisible(true);

        orangeBall.setSize(400, 400);
        orangeBall.setVisible(true);
    }
}

