package com.employeemanager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet{ Connection connect =null;
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
String Mname=request.getParameter("Mname");
String email=request.getParameter("email");
ps=connect.prepareStatement(" select * from manager where Mname=? and email=?");
ps.setString(1, Mname);
ps.setString(2, email);
ResultSet rs=ps.executeQuery();
PrintWriter pw=response.getWriter();
if(rs.next()) {
response.sendRedirect("./managerApprovel.html");
}
else {
response.sendRedirect("./managerLogin.html");
}
}catch(SQLException | NumberFormatException e) {
e.printStackTrace();
}
}
}

