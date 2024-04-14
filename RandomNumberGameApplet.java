import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RandomNumberGameApplet extends JApplet implements ActionListener {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 99;
    private static final int DELAY = 500; // Milliseconds
    private static final int TEXT_FIELD_WIDTH = 10;

    private JTextField[] textFields;
    private JButton[] buttons;
    private javax.swing.Timer timer; // Changed to javax.swing.Timer

    public void init() {
        setLayout(new GridLayout(4, 2));

        // Create text fields
        textFields = new JTextField[3];
        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new JTextField(TEXT_FIELD_WIDTH);
            textFields[i].setEditable(false);
            add(textFields[i]);
        }

        // Create buttons
        buttons = new JButton[3];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Stop " + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        // Create and start timer
        timer = new javax.swing.Timer(DELAY, e -> updateTextFields()); // Changed to javax.swing.Timer
        timer.start();
    }

    private void updateTextFields() {
        Random random = new Random();
        for (JTextField textField : textFields) {
            textField.setText(String.valueOf(random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER));
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Stop the timer
        timer.stop();

        // Check if all text fields have the same number
        String number = textFields[0].getText();
        boolean allSame = true;
        for (int i = 1; i < textFields.length; i++) {
            if (!textFields[i].getText().equals(number)) {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            JOptionPane.showMessageDialog(this, "Congratulations! You've won!", "Winner", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sorry! Try again.", "Try Again", JOptionPane.WARNING_MESSAGE);
            // Restart the timer
            timer.start();
        }
    }
}

