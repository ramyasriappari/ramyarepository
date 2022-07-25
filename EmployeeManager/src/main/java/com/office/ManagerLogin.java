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
@WebServlet("/ManagerLogin")
public class ManagerLogin extends javax.servlet.http.HttpServlet{
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
			String Password=request.getParameter("Password");
			try {
			ps=connection.prepareStatement("select*from manager where email=? and Password=?");
			ps.setString(1, email);
			ps.setString(2, Password);
			ResultSet rs=ps.executeQuery();
			
			if(rs !=null)
			{
			response.sendRedirect("employeeleaves.html");
			}
			else
			{
				response.sendRedirect("managerLogin.html");
			}
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }

