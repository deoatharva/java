import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AppletRead extends JApplet implements ActionListener {
    private JTextField nameField, remarksField;
    private JButton insertButton;

    public void init() {
        setLayout(new GridLayout(3, 2));

        // Create Name field
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        // Create Remarks field
        JLabel remarksLabel = new JLabel("Remarks:");
        remarksField = new JTextField(20);

        // Create Insert button
        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);

        // Add components to the applet
        add(nameLabel);
        add(nameField);
        add(remarksLabel);
        add(remarksField);
        add(insertButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            String name = nameField.getText();
            String remarks = remarksField.getText();
            try {
                insertData(name, remarks);
                JOptionPane.showMessageDialog(this, "Data inserted successfully.");
                nameField.setText("");
                remarksField.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error inserting data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void insertData(String name, String remarks) throws IOException {
        // Append data to the text file
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt", true))) {
            writer.println("Name: " + name + ", Remarks: " + remarks);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("AppletRead");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new AppletRead());
            frame.pack();
            frame.setVisible(true);
        });
    }
}

