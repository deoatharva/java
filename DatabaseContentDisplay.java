import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DatabaseContentDisplay extends JFrame {
    // Database connection parameters
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase"; // Update with your database URL
    private static final String USER = "username"; // Update with your database username
    private static final String PASSWORD = "password"; // Update with your database password

    private JTextArea textArea;

    public DatabaseContentDisplay() {
        setTitle("Database Content Display");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTextArea
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Layout JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);

        // Retrieve and display database contents
        displayDatabaseContents();

        setVisible(true);
    }

    private void displayDatabaseContents() {
        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Get table contents
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "your_table_name", null);

            if (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                textArea.append("Table Name: " + tableName + "\n\n");

                ResultSet tableData = connection.createStatement().executeQuery("SELECT * FROM " + tableName);
                ResultSetMetaData tableMetaData = tableData.getMetaData();
                int columnCount = tableMetaData.getColumnCount();

                // Display column names
                for (int i = 1; i <= columnCount; i++) {
                    textArea.append(tableMetaData.getColumnName(i) + "\t");
                }
                textArea.append("\n");

                // Display table data
                while (tableData.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        textArea.append(tableData.getString(i) + "\t");
                    }
                    textArea.append("\n");
                }
            } else {
                textArea.append("Table not found.");
            }

            // Close connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to fetch data from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DatabaseContentDisplay::new);
    }
}

