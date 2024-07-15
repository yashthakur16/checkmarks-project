package com.yash;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Student;

/**
 * Servlet implementation class marksServlet
 */
@WebServlet("/marks")
public class marksServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		PrintWriter out = response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		
		
		String url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass="";
		
		String query="select * from student_info where rollno="+roll+";";
		
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		Student s=new Student();
		s.setRoll(roll);
		
		String name=rs.getString("name");
		s.setName(name);
		
		int marks=rs.getInt("marks");
		s.setMarks(marks);
		
		request.setAttribute("student",s);
		
		RequestDispatcher rd=request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
