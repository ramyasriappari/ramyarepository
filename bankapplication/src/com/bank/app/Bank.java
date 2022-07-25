package com.bank.app;

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


@WebServlet("/Bank")
public class Bank extends javax.servlet.http.HttpServlet {
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
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String AccoHolderName=request.getParameter("AccoHolderName");
			int AccNum=Integer.parseInt(request.getParameter("AccNum"));	
			String IFSCCode=request.getParameter("IFSCCode");
			String Branch=request.getParameter("Branch");
				
	 
			
		
				ps=connect.prepareStatement("insert into bank(AccoHolderName, AccNum,IFSCCode,Branch) values(?,?,?,?)");
			ps.setString(1, AccoHolderName);
			ps.setInt(2, AccNum);
			ps.setString(3, IFSCCode);
			ps.setString(4, Branch);
			ps.executeUpdate();
			PrintWriter pw=response.getWriter();
			pw.println("Registered sucessfully..");
			
			} catch (SQLException | NumberFormatException e ) {
				// TODO Auto-generated catche block
				e.printStackTrace();
			}
	}
	}
	


