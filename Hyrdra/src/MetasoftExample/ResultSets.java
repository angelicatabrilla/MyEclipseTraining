package MetasoftExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSets {
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
				
				
					//UPDATE OR CANCEL UPDATE
//				 while(rs.next()) {
//			         if(rs.getInt("ID")==1) {
//			        	rs.updateString("First_Name","Angel");
//			        	rs.updateString("Last_Name","Tab");
//			            rs.updateString("Country", "Manila");
//			            //rs.cancelRowUpdates();
//			            rs.updateRow();
//			         }
//			      }
//			      rs.beforeFirst();
//			      System.out.println("Contents of the Employees table after the update: ");
//			      //Printing the contents of the table
//			      while(rs.next()) {
//			         System.out.print("ID: "+rs.getInt("ID")+", ");
//			         System.out.print("First Name: "+rs.getString("First_Name")+", ");
//			         System.out.print("Last Name: "+rs.getString("Last_Name")+", ");
//			         System.out.print("Date of Birth: "+rs.getDate("Date_Of_Birth")+", ");
//			         System.out.print("Place of Birth: "+rs.getString("Place_Of_Birth")+", ");
//			         System.out.print("Country: "+rs.getString("Country"));
//			         
//			         System.out.println();
//			      }
			      
			      
			      	//INSERT
//			      rs.last();
//			      int id = rs.getInt("ID")+1;
//			      rs.moveToInsertRow();
//			      rs.updateInt("ID", id);
//			      rs.updateString("First_Name","Jenniffer");
//			      rs.updateString("Last_Name","Alons");
//			      rs.updateString("Date_Of_Birth","1999-07-09");
//			      rs.updateString("Place_Of_Birth","Pasay");
//		          rs.updateString("Country", "Philippines");
//			      rs.insertRow();
//			      rs.beforeFirst();
//			      while(rs.next()) {
//			    	  System.out.print("ID: "+rs.getInt("ID")+", ");
//				         System.out.print("First Name: "+rs.getString("First_Name")+", ");
//				         System.out.print("Last Name: "+rs.getString("Last_Name")+", ");
//				         System.out.print("Date of Birth: "+rs.getDate("Date_Of_Birth")+", ");
//				         System.out.print("Place of Birth: "+rs.getString("Place_Of_Birth")+", ");
//				         System.out.print("Country: "+rs.getString("Country"));
//				      System.out.println();
//			      }  
				
			      
			      	//DELETE
//			      rs.last();
//			      rs.deleteRow();
//			      rs.beforeFirst();
//			      while(rs.next()) {
//			    	  System.out.print("ID: "+rs.getInt("ID")+", ");
//				      System.out.print("First Name: "+rs.getString("First_Name")+", ");
//				      System.out.print("Last Name: "+rs.getString("Last_Name")+", ");
//				      System.out.print("Date of Birth: "+rs.getDate("Date_Of_Birth")+", ");
//				      System.out.print("Place of Birth: "+rs.getString("Place_Of_Birth")+", ");
//				      System.out.print("Country: "+rs.getString("Country"));
//				      System.out.println();
//			      }
				
			      	//REFRESH
//			      stmt.executeUpdate("CREATE TABLE interns (intern_id INT, firstname VARCHAR(15), lastname VARCHAR(15), PRIMARY KEY(intern_id))");
//			      stmt.executeUpdate("INSERT INTO interns (intern_id, firstname, lastname) VALUES (1, 'Angelica', 'Tabrilla'), (2, 'Angel', 'Mandario'), (3, 'Miles', 'Borlongan')");
//				     
			      	rs =  stmt.executeQuery("SELECT * FROM interns");

				    // rs.beforeFirst();
				     rs.next();	
				     rs.next();	
				     rs.refreshRow();
				     
				    System.out.print("ID: "+rs.getInt("intern_id")+", ");
					System.out.print("First Name: "+rs.getString("firstname")+" ");
					System.out.print("Last Name: "+rs.getString("lastname"));
					System.out.println();
//			      rs.close();
//			      stmt.close();
//			      con.close();
				
		 }	catch (Exception e) {
				System.out.println("Error Connecting to SQL!");
				e.printStackTrace();
				
				}
	}
}
