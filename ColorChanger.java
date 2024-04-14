import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChanger extends JFrame {

    private JPanel colorPanel;
    private JButton changeColorButton;
    private Random random;

    public ColorChanger() {
        setTitle("Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        colorPanel = new JPanel();
        changeColorButton = new JButton("Change Color");
        random = new Random();

        changeColorButton.addActionListener(new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(colorPanel, BorderLayout.CENTER);
        getContentPane().add(changeColorButton, BorderLayout.SOUTH);
    }

    private void changeColor() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);
        colorPanel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            //@Override
            public void run() {
                ColorChanger app = new ColorChanger();
                app.setVisible(true);
            }
        });
    }
}

