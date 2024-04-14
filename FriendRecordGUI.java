import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FriendRecordGUI extends JFrame implements ActionListener {
    private JTextField nameField, dobField, detailsField, phoneNumberField;
    private JButton insertButton, updateButton, deleteButton;

    private Connection connection;

    public FriendRecordGUI() {
        setTitle("Friend Records Management");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Update with your database URL
        String user = "username"; // Update with your database username
        String password = "password"; // Update with your database password

        // Connect to the database
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to connect to database.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel dobLabel = new JLabel("Date of Birth (YYYY-MM-DD):");
        dobField = new JTextField(20);

        JLabel detailsLabel = new JLabel("Details:");
        detailsField = new JTextField(20);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField(20);

        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);

        updateButton = new JButton("Update");
        updateButton.addActionListener(this);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);

        // Layout components
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(dobLabel);
        panel.add(dobField);
        panel.add(detailsLabel);
        panel.add(detailsField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);
        panel.add(insertButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        // Add panel to frame
        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            insertRecord();
        } else if (e.getSource() == updateButton) {
            updateRecord();
        } else if (e.getSource() == deleteButton) {
            deleteRecord();
        }
    }

    private void insertRecord() {
        try {
            String query = "INSERT INTO Friends (Name, Dob, Details, PhoneNumber) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nameField.getText());
            preparedStatement.setString(2, dobField.getText());
            preparedStatement.setString(3, detailsField.getText());
            preparedStatement.setString(4, phoneNumberField.getText());

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Friend record inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to insert friend record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecord() {
        try {
            String query = "UPDATE Friends SET Name = ?, Dob = ?, Details = ?, PhoneNumber = ? WHERE Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nameField.getText());
            preparedStatement.setString(2, dobField.getText());
            preparedStatement.setString(3, detailsField.getText());
            preparedStatement.setString(4, phoneNumberField.getText());
            preparedStatement.setString(5, nameField.getText()); // Use name as a reference for updating

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Friend record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to update friend record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRecord() {
        try {
            String query = "DELETE FROM Friends WHERE Name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nameField.getText()); // Use name as a reference for deleting

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Friend record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to delete friend record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FriendRecordGUI::new);
    }
}

