<%@page import="java.sql.*" %>
<%@page import="employeemanager1.*" %>
<%  
Connection connect=DbConnection.getconnect();
int lid=Integer.parseInt(request.getParameter("lid"));
String name=(String)session.getAttribute("mname");
PreparedStatement ps=connect.prepareStatement("update leavesapply set mname=?,status=? where lid=?");
ps.setString(1, name);
ps.setString(2,"Accepted");
ps.setInt(3,lid);
int x=ps.executeUpdate();
if(x!=0)
{
	response.sendRedirect("manager_leaves.jsp");
}
	
%>