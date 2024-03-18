import java.sql.*;
public class JdbcDemo7
{

	Connection connurl;
	CallableStatement cstmt;
	String url,sqlstr;
	
	JdbcDemo7()
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

			url="jdbc:odbc:virgindsn";
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
		JdbcDemo7 obj=new JdbcDemo7();
	}
}