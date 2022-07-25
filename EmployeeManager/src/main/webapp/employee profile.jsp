<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">welcome to MotivityLabs home page</h1>
<h2 align="center"><a href="index.html">Home</a>
<a href="employees.html">EmployeeRegister</a>
<a href="employeeLogin.html">EmployeeLogin</a>
<a href="manager.html">ManagerRegister</a>
<a href="managerLogin.html">ManagerLoginr</a>
</h2>
<h2 align="center"><a href="manager.html">Home</a>
<a href="employees profile.jsp">profile</a>
<a href="employees.jsp">manager details</a>
<a href="index.html">logout</a>
</h2>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.office.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr><td>id</td><td>EmployeeName</td><td>Designation</td><td>email</td><td>PhoneNum</td></tr>
<%
Connection connection=DbConnection.getConnect();
int id=(Integer)session.getAttribute("id");

PreparedStatement ps=connection.prepareStatement("select*from employees where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td><td><%=rs.getInt(5)%></td>
</tr>
<%} %>
</table>
</body>
</html>

