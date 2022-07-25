package com.employeemanager;

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
@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
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

String ename=request.getParameter("ename");
String email=request.getParameter("email");

String department=request.getParameter("department");
int phoneno=Integer.parseInt(request.getParameter("phoneno"));
int NoOfLeaves=Integer.parseInt(request.getParameter("leaves"));


ps=connect.prepareStatement("insert into employeedetails(ename,email,department,phoneno,leaves) values(?,?,?,?,?)");

ps.setString(1, ename);
ps.setString(2, email);
ps.setString(3, department);
ps.setInt(4, phoneno);
ps.setInt(5, NoOfLeaves);
int x= ps.executeUpdate();
PrintWriter pw=response.getWriter();

if(x!=0) {
	
response.sendRedirect("./employeeLogin.html");
}
else {
response.sendRedirect("./EmployeeRegister.html");
}
}catch(SQLException | NumberFormatException e) {
e.printStackTrace();

}
}
}