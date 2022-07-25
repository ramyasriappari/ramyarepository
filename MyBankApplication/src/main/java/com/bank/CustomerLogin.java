package com.bank;
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
@WebServlet("/CustomerLogin")
public class CustomerLogin extends javax.servlet.http.HttpServlet{
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
			String password=request.getParameter("password");
			try {
			ps=connection.prepareStatement("select*from customer where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
			response.sendRedirect("./customerhome.html");
			}
			else
			{
				response.sendRedirect("./customerLogin.html");
			}
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }
