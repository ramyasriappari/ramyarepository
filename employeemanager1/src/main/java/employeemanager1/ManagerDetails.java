package employeemanager1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManagerDetails")
public class ManagerDetails extends HttpServlet {

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
			
			String mname=(String)request.getParameter("mname");
			String email=request.getParameter("email");
			String department=request.getParameter("department");
			
			int phoneNo=Integer.parseInt(request.getParameter("phoneno"));
			
			
	
			ps=connect.prepareStatement("insert into mananger(mname,email,department,phoneno) values(?,?,?,?)");
            
			ps.setString(1, mname);
			ps.setString(2, email);
		    ps.setString(3, department);
			ps.setInt(4, phoneNo);
			
		int x=	ps.executeUpdate();
		PrintWriter pw=response.getWriter();
		if(x!=0) {
			response.sendRedirect("./managerLogin.html");
		}
		else {
		   response.sendRedirect("./manager.html");
		}
		}catch(SQLException | NumberFormatException e) {
			e.printStackTrace();
			
		}
		}
	
}
