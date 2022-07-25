package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateInPrepareStatement {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement("update bank set IFSCCode=? where AccNum=?"); 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter IFSCCode");
        ps.setString(1,sc.next());
        System.out.println("enter Account Num");
        ps.setString(2,sc.next());
        int x=ps.executeUpdate();
        if(x!=0)
        {
        	System.out.println("record updated");
        }
        
	}

}
