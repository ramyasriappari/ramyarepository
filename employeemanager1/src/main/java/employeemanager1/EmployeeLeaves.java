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
import javax.servlet.http.HttpSession;

@WebServlet("/EmployeeLeaves")
public class EmployeeLeaves  extends HttpServlet{

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
				HttpSession session=request.getSession();
				
				String eemail=(String) session.getAttribute("eemail");
				
				String fromdate=request.getParameter("fromdate");
				String todate=request.getParameter("todate");
				int totalleaves=Integer.parseInt(request.getParameter("totalleaves"));
				String  status=request.getParameter("status");
				String  action= request.getParameter(" action");
				int noOfDays=Integer.parseInt(request.getParameter("noOfDays"));
		
				
		
				ps=connect.prepareStatement("insert into leaveapply(fromdate,todate) values(?,?)");
	            
				ps.setString(1, fromdate);
				ps.setString(2, todate );
				
			int x=	ps.executeUpdate();
			PrintWriter pw=response.getWriter();
			if(x!=0) {
				
				response.sendRedirect("./managerhome.html");
			}
			else {
			   response.sendRedirect("./EmployeeNoOfLeaves.html");
			}
			}catch(SQLException | NumberFormatException e) {
				e.printStackTrace();
				
			}
			}
	}
