package com.office;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends javax.servlet.http.HttpServlet{
	Connection connection =null;
	 PreparedStatement ps=null;
	 public void init(ServletConfig config) {
		 try {
			connection=DbConnection.getConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String email=request.getParameter("email");
		 int PhoneNum=Integer.parseInt(request.getParameter("PhoneNum"));	
			HttpSession hs=request.getSession();
			try {
			ps=connection.prepareStatement("select*from employees where email=? and PhoneNum=?");
			ps.setString(1, email);
			ps.setInt(2, PhoneNum);
			
			ResultSet rs=ps.executeQuery();
			PrintWriter pw =response.getWriter();
		
			if(rs.next())
			{
				response.sendRedirect("./employeeleaves.html");
			}
			else
			{
				response.sendRedirect("./employeeLogin.html");
			}
				
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }

