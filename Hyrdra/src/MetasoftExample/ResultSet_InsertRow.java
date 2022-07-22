package MetasoftExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_InsertRow {
	 public static void main(String[]args) {		
		 String domain = "jdbc:mysql://localhost:3306/metasoft";
		 String root = "root";
		 String password = "Artabrilla9699";
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(domain, root, password);
				
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				String query = "Select * from customers";
				ResultSet rs = stmt.executeQuery(query);
				 System.out.println("Connection established......");
			    rs.last();
			      int id = rs.getInt("ID")+1;
			      int age = 22;
			      int salary = 1000;
			      rs.moveToInsertRow();
			      rs.updateInt("ID", id);
			      rs.updateString("Name", "Angelica Tabs");
			      rs.updateInt("AGE", age);
			      rs.updateInt("SALARY", salary);
			      rs.updateString("ADDRESS", "Pasay, Philippines");
			      rs.insertRow();
			      rs.beforeFirst();
			      System.out.println("Contents of the table after inserting a new row: ");
			      while(rs.next()) {
			         System.out.print("ID: "+rs.getInt("ID")+", ");
			         System.out.print("Name: "+rs.getString("NAME")+", ");
			         System.out.print("AGE: "+rs.getInt("AGE")+", ");
			         System.out.print("SALARY: "+rs.getInt("SALARY")+", ");
			         System.out.print("ADDRESS: "+rs.getString("ADDRESS")+", ");
			         System.out.println();
			      }
		
	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
		}
	 }
}


