package com.office;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Manager")
public class  Manager extends javax.servlet.http.HttpServlet {
	Connection connect =null;
	 PreparedStatement ps=null;
		public void init(ServletConfig config) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
				String url ="jdbc:mysql://localhost:3306/motivity";
				String user="root";
				String pass="root";
				try {
					connect=DriverManager.getConnection(url,user,pass);
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			int id=Integer.parseInt(request.getParameter("id"));	
			String ManagerName=request.getParameter("ManagerName");
			String email=request.getParameter("email");	
			String Password=request.getParameter("Password");
			int PhoneNum=Integer.parseInt(request.getParameter("PhoneNum"));	
			
		
				ps=connect.prepareStatement("insert into manager(id,ManagerName,email, Password,PhoneNum) values(?,?,?,?,?)");
				ps.setInt(1, id);
			    ps.setString(2,ManagerName );
			    ps.setString(3, email);
			    ps.setString(4,Password);
			    ps.setInt(5,PhoneNum );
			int x=ps.executeUpdate();
			//PrintWriter pw=response.getWriter();
			if(x!=0){
				response.sendRedirect("./managerLogin.html");
			}
			else
			{
				response.sendRedirect("./managerhome.html");
			
			//pw.println("Registered sucessfully..");
			
			}}catch (SQLException | NumberFormatException e ) {
				// TODO Auto-generated catche block
				e.printStackTrace();
			}
	}
	}
	

