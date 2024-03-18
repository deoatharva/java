import java.sql.*;
public class JdbcDemo5
{

	Connection connurl;
	PreparedStatement pstmt;
	String url,sqlstr;
	
	JdbcDemo5()
	{
		connect();
		insert();
	}

	public void connect()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();

		}
		
	}
	public void insert() 
	{
		try
		{

			sqlstr="insert into student values(?,?,?)";

			url="jdbc:odbc:virgindsn";
			connurl=DriverManager.getConnection(url);

			pstmt=connurl.prepareStatement(sqlstr);

			pstmt.setInt(1,18010);
			pstmt.setString(2,"xyz");
			pstmt.setInt(3,34);
			int b=pstmt.executeUpdate();
			System.out.println(b);
			pstmt.close();
			connurl.close();

		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}

	public static void main(String args[])
	{
		JdbcDemo5 obj=new JdbcDemo5();
	}
}