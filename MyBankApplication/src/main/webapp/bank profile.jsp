<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<br><br><br>
<h1 align="center">welcome to bank home</h1>
<h2 align="center"><a href="index.html">Home</a>
<a href="bank.html">BankRegister</a>
<a href="BankLogin.html">BankLogin</a>
<a href="customer.html">CustomerRegister</a>
<a href="customerLogin.html">CustomerLogin</a>
</h2>
<h2 align="center"><a href="bank.html">Home</a>
<a href="bank profile.jsp">profile</a>
<a href="banking.jsp">bank details</a>
<a href="index.html">logout</a>
</h2>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.bank.*" %>
<table border="2" width="400" height="200" cellpadding="20" align="center">
<tr><td>AccoHolderName</td><td>AccNum</td><td>IFSCCode</td><td>Branch</td></tr>
<%
Connection connection=DbConnection.getConnect();
int AccNum=(Integer)session.getAttribute("AccNum");

PreparedStatement ps=connection.prepareStatement("select*from bank where AccNum=?");
ps.setInt(1,AccNum);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getString(1)%></td><td><%=rs.getInt(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
</tr>
<%} %>
</table>
</body>
</html>

