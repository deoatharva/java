import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class DatabaseViewer extends JFrame implements ActionListener {
    private JComboBox<String> tableComboBox;
    private JButton displayButton;
    private JTextArea outputTextArea;

    private Connection connection;

    public DatabaseViewer() {
        setTitle("Database Viewer");
        setSize(400, 300);
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
        tableComboBox = new JComboBox<>();
        displayButton = new JButton("Display Records");
        displayButton.addActionListener(this);
        outputTextArea = new JTextArea();

        // Fetch table names from the database
        fetchTableNames();

        // Layout components
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(new JLabel("Select Table:"));
        topPanel.add(tableComboBox);
        topPanel.add(displayButton);

        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Add components to frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void fetchTableNames() {
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "%", null);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                tableComboBox.addItem(tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to fetch table names.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayButton) {
            String tableName = (String) tableComboBox.getSelectedItem();
            if (tableName != null) {
                displayTableRecords(tableName);
            }
        }
    }

    private void displayTableRecords(String tableName) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);
            ResultSetMetaData metaData = resultSet.getMetaData();

            StringBuilder output = new StringBuilder();
            int columnCount = metaData.getColumnCount();

            output.append("Records of table: ").append(tableName).append("\n\n");

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    output.append(metaData.getColumnName(i)).append(": ").append(resultSet.getObject(i)).append("\n");
                }
                output.append("\n");
            }

            outputTextArea.setText(output.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to fetch records from table.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DatabaseViewer::new);
    }
}

