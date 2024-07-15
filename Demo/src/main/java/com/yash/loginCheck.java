package com.yash;
import java.sql.*;

public class loginCheck {

	
	public boolean check(String username,String password)
	{
	
		String url="jdbc:mysql://localhost:3306/loginSystem";
		String uname="root";
		String pass="yash1616";
		
		String query="select * from logindata where username='"+username+"' and password='"+password+"';";
		
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return false;

	}
}
