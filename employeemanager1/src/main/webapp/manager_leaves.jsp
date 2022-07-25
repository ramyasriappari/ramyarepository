<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
<br><br><br>
<h1 align="center" padding="5px">employee ease portal</h1>
<h2 align="center" padding="5px" margin="5px"><a href="manager.html">Home</a> 
<a href="apply_leaves.jsp" padding="5px">Apply Leaves</a>
<a href="employee_Leaves.jsp" padding="5px">employee leaves</a>
<a href="index.html" padding="5px">logout</a>
</h2>

<br><br><br>
<%@page import="java.sql.*" %>
<%@page import="employeemanager1.*" %>
<h1>Manager home page</h1>
<table border="2" width="500" height="200" cellpadding="20">
<tr>
<td>LId</td>
<td>Fromdate</td>
<td>Todate</td>
<td>totalleaves</td>
<td>status</td>
<td>action</td>
<td>noofDays</td>
<td>department</td>
<td>managerid</td>
<td>Employee name</td>
<td>Employee email</td>
<td>Manager name</td>
<td>Employee id</td>
<td>Status update</td>
</tr>
<%  
Connection connect=DbConnection.getconnect();
String department=(String)session.getAttribute("department");
PreparedStatement ps=connect.prepareStatement("select * from leavesapply  where department=?");
ps.setString(1,department);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<tr><td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>

<td><%=rs.getString(3) %></td>
<td><%=rs.getInt(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getInt(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getInt(9) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>
<td><%=rs.getString(12) %></td>
<td><%=rs.getInt(13) %></td>
<td><a href="accept.jsp?lid=<%=rs.getInt(1)%>">Accept</a>
</tr>
<%} %>

</table>
</body>
</html>