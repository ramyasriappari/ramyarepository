package employeemanager1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet{

	Connection connect =null;
	 PreparedStatement ps=null;
		public void init(ServletConfig config) {
			try {
				connect=DbConnection.getconnect();
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
		}
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try {
				
				String mname=request.getParameter("mname");
				String email=request.getParameter("email");
				HttpSession session=request.getSession();
				ps=connect.prepareStatement(" select * from mananger where mname=? and email=?");
	            
				ps.setString(1, mname);
				ps.setString(2, email);
				ResultSet rs=ps.executeQuery();
				PrintWriter pw=response.getWriter();
				if(rs.next()) {
					session.setAttribute("mid", rs.getInt(1));
					session.setAttribute("mname", rs.getString(1));
					session.setAttribute("email", rs.getString(3));
					session.setAttribute("department", rs.getString(4));
					response.sendRedirect("./manager_leaves.jsp");
				}
				else {
				   response.sendRedirect("./managerLogin.html");
				}
				}catch(SQLException | NumberFormatException e) {
					e.printStackTrace();
					
				}
				}
		

	
}