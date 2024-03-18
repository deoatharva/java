import java.sql.*;
public class JdbcDemo6
{

	Connection connurl;
	CallableStatement cstmt;
	String url,sqlstr;
	
	JdbcDemo6()
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

			sqlstr="{call Query1(?,?,?)}";

			url="jdbc:odbc:syitdsn";
			connurl=DriverManager.getConnection(url);

			cstmt=connurl.prepareCall(sqlstr);


			cstmt.setInt(1,18011);
			cstmt.setString(2,"yyy");
			cstmt.setInt(3,45);
			int b=cstmt.executeUpdate();
			System.out.println(b);
			cstmt.close();
			connurl.close();

		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}

	public static void main(String args[])
	{
		JdbcDemo6 obj=new JdbcDemo6();
	}
}