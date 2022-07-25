<%@page import="java.sql.*" %>
<%@page import="employeemanager1.*" %>
<%
Connection connect=DbConnection.getconnect();
String ename=request.getParameter("ename");
String eemail=request.getParameter("eemail");
String fromdate=request.getParameter("fromdate");
String todate=request.getParameter("todate");
String department=request.getParameter("department");
int eid=(Integer)session.getAttribute("eid");
String sql="insert into leavesapply(ename,eemail,fromdate,todate,department,eid,mname,status) values(?,?,?,?,?,?,?,?)";
PreparedStatement ps=connect.prepareStatement(sql);
ps.setString(1, ename);
ps.setString(2, eemail);
ps.setString(3,fromdate);
ps.setString(4,todate);
ps.setString(5, department);
ps.setInt(6,eid);
ps.setString(7,"None");
ps.setString(8,"pending");
int x=ps.executeUpdate();
if(x!=0)
response.sendRedirect("./employee_leave.jsp");
%>