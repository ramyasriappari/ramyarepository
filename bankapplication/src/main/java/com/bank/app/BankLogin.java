package com.bank.app;

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
@WebServlet("/BankLogin")
public class BankLogin extends javax.servlet.http.HttpServlet{
	Connection connect =null;
	 PreparedStatement ps=null;
	 public void init(ServletConfig config) {
		 try {
			connect=DbConnection.getConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String IFSCCode=request.getParameter("IFSCCode");
			String Branch=request.getParameter("Branch");
			try {
			ps=connect.prepareStatement("select*from bank where IFSCCode=? and Branch=?");
			ps.setString(1, IFSCCode);
			ps.setString(2, Branch);
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=response.getWriter();
			if(rs.next())
			{
				pw.println("Retrieve sucessfully..");
			}
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }

