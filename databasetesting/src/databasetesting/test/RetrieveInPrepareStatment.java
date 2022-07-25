package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class RetrieveInPrepareStatment {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement("select * from bank where IFSCCode=?");
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter IFSCCode");
        ps.setString(1,sc.next());
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        ps.close();
        connection.close();
        
		
	}

	
}
