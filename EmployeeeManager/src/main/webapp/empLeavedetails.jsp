<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="java.sql.*" import="com.employeemanager.*"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2" align="center">
<tr><td>ename</td><td>empid</td><td>fromdate</td><td>todate</td><td>reason</td><td>designation</td><td> totalNoOfleaves</td><td> leavesPermonth</td><td> status</td></tr>

<% 

String ename=(String)session.getAttribute("ename");
Connection connect=DbConnection.getconnect();
PreparedStatement ps=connect.prepareStatement("select * from empleaves where ename=? ;" );
ps.setString(1, ename);
HttpSession hs=request.getSession();
ResultSet rs=ps.executeQuery();
while(rs.next()){%>


<tr><td>    <%=rs.getString("ename") %></td><td>    <%=rs.getInt("empid") %></td><td>    <%=rs.getString("fromdate") %></td><td>    <%=rs.getString("todate") %></td><td>    <%=rs.getString("reason") %></td>
<td>    <%=rs.getString("designation") %></td><td>    <%=rs.getString("totalNoOfleaves") %></td><td>    <%=rs.getString("leavesPermonth") %></td><td><%=rs.getString("status") %></td></tr>

<% }   
%>
</table>
</body>
</html>