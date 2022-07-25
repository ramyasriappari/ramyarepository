package databasetesting.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class SwitchInPrepared
{
	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection connection= DriverManager.getConnection(url, username, password);
		Scanner sc=new Scanner(System.in);
		int Choice;
		
		do
		{
			System.out.println("press 1 to inseert the Record");
			System.out.println("press 2 to delete the Record");
			System.out.println("press 3 to update the Record");
			System.out.println("press 4 to retrieve the Record");
			System.out.println("press 5 to exit");
			Choice=sc.nextInt();
		
	
			switch(Choice)
			{
			case 1:
			
	        PreparedStatement ps=connection.prepareStatement("insert into bank values(?,?,?,?)");
	        System.out.println("enter acc holder name");
	        ps.setString(1, sc.next());
	        System.out.println("enter Acc no");
	        ps.setInt(2, sc.nextInt());
	        System.out.println("enter ifsc code");
	        ps.setString(3,sc.next());
	        System.out.println("enter branch");
	        ps.setString(4,sc.next());
	        int x=ps.executeUpdate();
	        if(x!=0) {
	        	System.out.println("reacord inserted");
	        }
	        else {
	        	System.out.println("invalid input");
	        }
			break;
			case 2:
		
	
		        PreparedStatement ps1=connection.prepareStatement("delete from bank where AccoHolderName=?");
		     
		        System.out.println("enter acc holder name");
		        ps1.setString(1, sc.next());
		        int x1=ps1.executeUpdate();
		        if(x1!=0) {
		        	System.out.println("reacord deleted");
		        }
		        else {
		        	System.out.println("invalid input");
			}
		        break;
			case 3:
		        PreparedStatement ps2 = connection.prepareStatement("update bank set IFSCCode=? where AccNum=?"); 
		        System.out.println("enter IFSCCode");
		        ps2.setString(1,sc.next());
		        System.out.println("enter Account Num");
		        ps2.setString(2,sc.next());
		        int x2=ps2.executeUpdate();
		        if(x2!=0)
		        {
		        	System.out.println("record updated");
		        }
		        break;
			case 4:
				PreparedStatement ps3 = connection.prepareStatement("select * from bank where IFSCCode=?");
		        System.out.println("enter IFSCCode");
		        ps3.setString(1,sc.next());
		        ResultSet rs=ps3.executeQuery();
		        
		        while(rs.next())
		        {
		        	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		        }
		        
		        
		        ps3.close();
		        connection.close();	
			default :
				break;
		}

	}
		while(Choice!=5);
		
			System.out.println("enter your choice");
		
		
	}
}
