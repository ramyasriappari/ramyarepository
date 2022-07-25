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
@WebServlet("/EmployeeLeaves")
public class EmployeeLeaves extends HttpServlet{
	
	
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
           int empid=Integer.parseInt(request.getParameter("empid"));

           String degisnation=request.getParameter("designation");
           String from=request.getParameter("fromdate");
           String to=request.getParameter("todate");
           String mname=request.getParameter("mname");

           int days=Integer.parseInt(request.getParameter("days"));
           String reason=request.getParameter("reason");

           ps=connect.prepareStatement("insert into empleaves(ename,empid,designation,fromdate,todate,days,reason,mname,satus) values(?,?,?,?,?,?,?,?,?)");
           ps.setString(1, ename);
           ps.setInt(2, empid);

           ps.setString(3, degisnation);
           ps.setString(4,from );
           ps.setString(5,to);
           ps.setInt(6, days);
           ps.setString(7,reason );
           ps.setString(8,mname );
           ps.setString(9,"pending" );
           int x=ps.executeUpdate();
       PrintWriter pw=response.getWriter();
       if(x!=0) {

           response.sendRedirect("./empLeavedetails.jsp");
       }
       else {

          response.sendRedirect("./leave.jsp");
       }
       }catch(SQLException | NumberFormatException e) {
           e.printStackTrace();
       }

       }
}