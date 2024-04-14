import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerClass1 {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.setFocusable(true); // Ensure panel is focusable to receive key events

        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    label.setText("Up arrow key pressed");
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label.setText("Down arrow key pressed");
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("key typed");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key is released");
            }
            
        });
    }
}

