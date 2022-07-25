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

@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet{

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
				
				String eemail=request.getParameter("email");
				String password=request.getParameter("password");
				
				ps=connect.prepareStatement(" select * from employeedetails where email=? and password=?");
	            
				ps.setString(1, eemail);
				ps.setString(2, password);
				ResultSet rs=ps.executeQuery();
				HttpSession session=request.getSession();
				PrintWriter pw=response.getWriter();
				if(rs.next()) {
					session.setAttribute("eid",rs.getInt(1));
					session.setAttribute("ename", rs.getString(2));
					session.setAttribute("eemail", rs.getString(3));
					response.sendRedirect("./employeeHomePage.html");
				}
				else {
				   response.sendRedirect("./employeeLogin.html");
				}
				}catch(SQLException | NumberFormatException e) {
					e.printStackTrace();
					
				}
				}
		

		}