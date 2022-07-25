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
import javax.servlet.http.HttpSession;
@WebServlet("/BankLogin")
public class BankLogin extends javax.servlet.http.HttpServlet{
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
		 String IFSCCode=request.getParameter("IFSCCode");
			String Branch=request.getParameter("Branch");
			HttpSession hs=request.getSession();
			try {
			ps=connection.prepareStatement("select*from bank where IFSCCode=? and Branch=?");
			ps.setString(1, IFSCCode);
			ps.setString(2, Branch);
			
			ResultSet rs=ps.executeQuery();
		
			if(rs.next())
			{
				hs.setAttribute("AccNum", rs.getInt("AccNum"));
				hs.setAttribute("IFSCCode",rs.getString("IFSCCode"));
				hs.setAttribute("Branch",rs.getString("Branch"));
				
				response.sendRedirect("./bankhome.html");
			}
			else
			{
				response.sendRedirect("./BankLogin.html");
			}
				
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }


