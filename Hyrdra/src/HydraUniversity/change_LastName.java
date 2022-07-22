package HydraUniversity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class change_LastName {
	
	//CHANGE LAST NAME
		static void change_lname(String change_lname) {
			Scanner input = new Scanner(System.in);
			
			ClassID id = new ClassID();
			int internID;
			
			try {			
				Connection con = AccountConnectionDB.getInstance().getConnection();
				
				
				String changeLastName= "{call change_lastName(?,?)}";
				CallableStatement cstmt =  con.prepareCall(changeLastName); 
				
				internID = id.getStudentID();
				System.out.print("Insert New Last Name: ");
				String newlname = input.nextLine();
				
				cstmt.setInt(1, Integer.valueOf(internID));
				cstmt.setString(2, String.valueOf(newlname));
				cstmt.executeUpdate();
				System.out.println("\nNEW LAST NAME: " + cstmt.getString(2));
		
				input.close();
				con.close();	
		}
			catch (Exception e) {
				System.out.println("Error Connecting to SQL!");
				e.printStackTrace();	
				}
		}

}
