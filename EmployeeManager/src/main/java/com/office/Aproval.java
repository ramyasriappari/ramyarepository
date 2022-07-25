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
@WebServlet("/Aproval")
public class Aproval extends javax.servlet.http.HttpServlet{
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int totalleaves=Integer.parseInt(request.getParameter("totalleaves"));
		 int usedleaves=Integer.parseInt(request.getParameter("usedleaves"));	
			//HttpSession hs=request.getSession();
			try {
			ps=connection.prepareStatement("select*from employeeleaves where totalleaves<=? and usedleaves<=? ");
			ps.setInt(1, totalleaves);
			ps.setInt(2, usedleaves);
			
			ResultSet rs=ps.executeQuery();
		
			if(rs.next())
			{
				
				response.sendRedirect("./manager.html");
			}
			else
			{
				response.sendRedirect("./managerhome.html");
			}
				
		
			
	 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 }


