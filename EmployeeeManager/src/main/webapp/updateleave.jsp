<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*" import="com.employeemanager.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<% 
String name= (String)session.getAttribute("mname");
int totleave=(Integer)session.getAttribute("totleave");
int reqleave=(Integer)session.getAttribute("reqleave");
String status;
if(totleave>=reqleave&&reqleave<=2)
{
    status="accepted";
    totleave=totleave-reqleave;
}
else{
    status="rejected";
}

   Connection connect=null;
try{
  connect=DbConnection.getconnect();

   PreparedStatement ps=connect.prepareStatement(" update empleaves set status=?,totalNoOfleaves=? where mname=? and status='pending' ;" );

   ps.setString(1,status );
   ps.setInt(2, totleave);
   ps.setString(3,name );

int x=ps.executeUpdate();
if(x!=0)
{
    response.sendRedirect("requestleave.jsp");
}
else{
    response.sendRedirect("requestleave.jsp");
}
 %>
 <%   

   }
  finally
  {
    connect.close();
  }
%>
</body>
</html>