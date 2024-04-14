import java.sql.*;

public class QueryProcessor {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java QueryProcessor <SQL query>");
            return;
        }

        String query = args[0];

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Update with your database URL
        String user = "username"; // Update with your database username
        String password = "password"; // Update with your database password

        // Connect to the database
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create statement
            Statement statement = connection.createStatement();

            // Execute query
            ResultSet resultSet = statement.executeQuery(query);

            // Get metadata
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print column titles
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnLabel(i));
                if (i < columnCount) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            // Print separator line
            for (int i = 1; i <= columnCount; i++) {
                System.out.print("-".repeat(metaData.getColumnLabel(i).length()));
                if (i < columnCount) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            // Print query result
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i));
                    if (i < columnCount) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

