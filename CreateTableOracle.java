import java.sql.*;
public class CreateTableOracle
{
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "root";
	private static final String PASSWORD = "system";
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.oracleDriver");
			Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
			createTable(connection);
			connection.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printstackTrace();
		}
	}
	private static void createTable(Connection connection) throws SQLException
	{
		String createTableQuery ="CREATE TABLE Friends ("
			+ "FriendName VARCHAR2(50), "
			+ "Dob DATE, "
			+ "Details VARCHAR2(20), "
			+ "PhoneNumber NUMBER(10))"
		Statement Statement = connection.createStatement();
		statement.executeUpdate(createTableQuery);
		statement.close();
		System.out.println("Tablecreated successfully")
	}
}