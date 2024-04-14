import java.sql.*;

public class OracleDatabaseOperations {
    // Database connection parameters
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Update with your database URL
    private static final String USER = "your_username"; // Update with your database username
    private static final String PASSWORD = "your_password"; // Update with your database password

    public static void main(String[] args) {
        try {
            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection to the database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create table
            createTable(connection);

            // Insert records
            insertRecords(connection);

            // Show all records
            showRecords(connection);

            // Close connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableQuery = "CREATE TABLE Friends ("
                + "FriendName VARCHAR2(50), "
                + "Dob DATE, "
                + "Details VARCHAR2(20), "
                + "PhoneNumber NUMBER(10))";

        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableQuery);
        statement.close();
        System.out.println("Table created successfully.");
    }

    private static void insertRecords(Connection connection) throws SQLException {
        String insertQuery = "INSERT INTO Friends (FriendName, Dob, Details, PhoneNumber) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        // Inserting records
        preparedStatement.setString(1, "John");
        preparedStatement.setDate(2, Date.valueOf("1990-05-15"));
        preparedStatement.setString(3, "School Friend");
        preparedStatement.setLong(4, 1234567890);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Alice");
        preparedStatement.setDate(2, Date.valueOf("1985-10-25"));
        preparedStatement.setString(3, "College Friend");
        preparedStatement.setLong(4, 9876543210L);
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Bob");
        preparedStatement.setDate(2, Date.valueOf("1992-03-30"));
        preparedStatement.setString(3, "Work Friend");
        preparedStatement.setLong(4, 7890123456L);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        System.out.println("Records inserted successfully.");
    }

    private static void showRecords(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM Friends";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);

        System.out.println("\nAll Records from the table:");
        System.out.println("Friend Name | DOB        | Details        | Phone Number");
        System.out.println("-----------------------------------------------");
        while (resultSet.next()) {
            String friendName = resultSet.getString("FriendName");
            Date dob = resultSet.getDate("Dob");
            String details = resultSet.getString("Details");
            long phoneNumber = resultSet.getLong("PhoneNumber");

            System.out.println(friendName + " | " + dob + " | " + details + " | " + phoneNumber);
        }

        resultSet.close();
        statement.close();
    }
}

