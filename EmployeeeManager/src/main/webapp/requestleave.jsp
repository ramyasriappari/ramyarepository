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
<tr><td>ename</td><td>empid</td><td>fromdate</td><td>todate</td><td>reason</td><td>designation</td><td> totalNoOfleaves</td><td> leavesPermonth</td><td> status</td><td> action</td></tr>

<% 

String Mname=(String)session.getAttribute("Mname");
Connection connect=DbConnection.getconnect();
PreparedStatement ps=connect.prepareStatement("select * from empleaves where mname=?" );
ps.setString(1, Mname);
HttpSession hs=request.getSession();
ResultSet rs=ps.executeQuery();
while(rs.next()){
      hs.setAttribute("mname", rs.getString(6));
      hs.setAttribute("totleave", rs.getInt(8));
      hs.setAttribute("reqleave", rs.getInt(10));
  %>


<tr><td>    <%=rs.getString("ename") %></td><td>    <%=rs.getInt("empid") %></td><td>    <%=rs.getString("fromdate") %></td><td>    <%=rs.getString("todate") %></td><td>    <%=rs.getString("reason") %></td>
<td>    <%=rs.getString("designation") %></td><td>    <%=rs.getString("totalNoOfleaves")%></td><td><%=rs.getString("leavesPermonth") %></td><td><%=rs.getString("status") %></td><td><a href="updateleave.jsp?totalleaves<%=rs.getInt("totalNoOfleaves")%>&days<%=rs.getInt("days") %>&mname<%=rs.getString(6) %>">accept</a></td><td></tr>

<% }   
%>
</table>
</body>
</html>