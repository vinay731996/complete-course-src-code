package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseDemo {

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";

		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qabt", "root", "731996");

		Statement s=con.createStatement();  //this road 

		ResultSet rs=s.executeQuery("select * from EmployeeInfo"); //cycle
		
		while(rs.next())
		{
		   //  System.out.println(rs.getString("name")+" "+rs.getString("id")+" "+rs.getString("location")+" "+rs.getString("age"));
		     
			 System.out.println(rs.getString("name"));
			
		     System.out.println(rs.getString("id"));
		
	         System.out.println(rs.getString("location"));
		 
	         System.out.println(rs.getString("age"));
		}
			

	}

}
