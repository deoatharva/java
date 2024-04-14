import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerClass {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.addMouseWheelListener(new MouseWheelListener() {
           
            public void mouseWheelMoved(MouseWheelEvent e) {
                int direction = e.getWheelRotation();
                if (direction < 0) {
                    label.setText("Mouse wheel moved up");
                } else {
                    label.setText("Mouse wheel moved down");
                }
            }
        });
    }
}
