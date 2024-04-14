import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeRecordGUI extends JFrame implements ActionListener {
    private JTextField empNoField, empNameField, salaryField;
    private JButton insertButton, updateButton, deleteButton;

    private Connection connection;

    public EmployeeRecordGUI() {
        setTitle("Employee Records Management");
        setSize(400, 200);
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
        JLabel empNoLabel = new JLabel("Emp No:");
        empNoField = new JTextField(10);

        JLabel empNameLabel = new JLabel("Emp Name:");
        empNameField = new JTextField(10);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(10);

        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);

        updateButton = new JButton("Update");
        updateButton.addActionListener(this);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);

        // Layout components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(empNoLabel);
        panel.add(empNoField);
        panel.add(empNameLabel);
        panel.add(empNameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
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
            CallableStatement callableStatement = connection.prepareCall("{CALL insert_employee(?, ?, ?)}");
            callableStatement.setInt(1, Integer.parseInt(empNoField.getText()));
            callableStatement.setString(2, empNameField.getText());
            callableStatement.setDouble(3, Double.parseDouble(salaryField.getText()));

            callableStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee record inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to insert employee record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecord() {
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL update_employee(?, ?, ?)}");
            callableStatement.setInt(1, Integer.parseInt(empNoField.getText()));
            callableStatement.setString(2, empNameField.getText());
            callableStatement.setDouble(3, Double.parseDouble(salaryField.getText()));

            callableStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to update employee record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRecord() {
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL delete_employee(?)}");
            callableStatement.setInt(1, Integer.parseInt(empNoField.getText()));

            callableStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to delete employee record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeRecordGUI::new);
    }
}

