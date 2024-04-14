import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    TextField tf; // Declare tf outside main method so it can be accessed in actionPerformed

    public static void main(String[] args) {
        ActionListenerExample obj = new ActionListenerExample(); // Create an instance of ActionListenerExample
        obj.createGUI(); // Call the method to create GUI
    }

    public void createGUI() {
        Frame f = new Frame("ActionListener Example");
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this); // Add ActionListener to the button
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    // actionPerformed method to handle button click event
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome Sir Atharva");
    }
}

