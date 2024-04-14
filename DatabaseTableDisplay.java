import javax.swing.*;
import java.awt.*;
import java.sql.*; 
public class DatabaseTableDisplay extends JFrame
{
	private JTable table;
	public DatabaseTableDisplay()
	{
		setTitle("DatabaseTableDisplay");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String url ="jdbc:mysql://localhost:3306/mydatabase";
		String user = "username";
		String password = "password";
		try(Connection connection = DriverManager.getConnection(url,user,password))
		{
			String query = "SELECT * FROM employees";
			try(Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery(query))
			{
				ResultSetMetaData metaData = resultSet.getMetaData();
				int columnCount = metaData.getConnectionCount();
				String[] columnNames = new String[columnCount];
				for(int i=1;i<=columnCount;i++)
				{
					columnNames[i-1]=metaData.getColumnNames(i);
				}
				Object[][] data = new Object[100][columnCount];
				int rowCount = 0;
				while(resultSet.next())
				{
					for(int i=1;i<=coloumnCount;i++)
					{
						data[rowCount][i-1]=resultSet.getObject(i);
					}
					rowCount++;
				}
				table = new JTable(data,columnNames);
				JScrollPane scrollPane = new JScrollPane(table);
				getContentPane().add(scrollPane,BorderLayout.CENTER);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(this,"error : unable to connect");
		}
		setVisibile(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(DatabaseTableDisplay::new);
	}
}