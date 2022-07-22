package MetasoftExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_UpdateRow {
	 public static void main(String[]args) {		
		 String domain = "jdbc:mysql://localhost:3306/metasoft";
		 String root = "root";
		 String password = "Artabrilla9699";
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(domain, root, password);
				
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				String query = "Select * from myplayers";
				ResultSet rs = stmt.executeQuery(query);
				
				 while(rs.next()) {
			         if(rs.getInt("ID")==1) {
			        	 rs.updateString("First_Name","Angelica");
			        	rs.updateString("Last_Name","Tabrilla");
			            rs.updateString("Country", "Manila");
			            // rs.cancelRowUpdates();
			            rs.updateRow();
			         }
			      }
			      rs.beforeFirst();
			      System.out.println("Contents of the Employees table after the update: ");
			      //Printing the contents of the table
			      while(rs.next()) {
			         System.out.print("ID: "+rs.getInt("ID")+", ");
			         System.out.print("First Name: "+rs.getString("First_Name")+", ");
			         System.out.print("Last Name: "+rs.getString("Last_Name")+", ");
			         System.out.print("Date of Birth: "+rs.getDate("Date_Of_Birth")+", ");
			         System.out.print("Place of Birth: "+rs.getInt("Place_Of_Birth")+", ");
			         System.out.print("Country: "+rs.getInt("Country"));
			         
			         System.out.println();
			      }
			   
		
	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
		}
	 }
}


