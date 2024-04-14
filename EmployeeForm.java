import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeForm extends JFrame implements ActionListener {
    private JTextField empNoField, empNameField, salaryField;
    private JButton submitButton;

    private Connection connection;

    public EmployeeForm() {
        setTitle("Employee Form");
        setSize(300, 200);
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

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Layout components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(empNoLabel);
        panel.add(empNoField);
        panel.add(empNameLabel);
        panel.add(empNameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(submitButton);

        // Add panel to frame
        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String empNo = empNoField.getText();
            String empName = empNameField.getText();
            String salary = salaryField.getText();

            if (empNo.isEmpty() || empName.isEmpty() || salary.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Statement statement = connection.createStatement();
                String query = "INSERT INTO EMP (empno, ename, salary) VALUES (" + empNo + ", '" + empName + "', " + salary + ")";
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Employee record added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                empNoField.setText("");
                empNameField.setText("");
                salaryField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: Unable to add employee record.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeForm::new);
    }
}

