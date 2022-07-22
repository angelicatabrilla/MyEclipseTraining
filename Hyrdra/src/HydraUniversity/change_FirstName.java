package HydraUniversity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class change_FirstName {
	
	//CHANGE FIRST NAME
		static void change_fname(String change_fname) {
			
			Scanner input = new Scanner(System.in);
			
			ClassID id = new ClassID();
			int internID;
			
			try {			
				Connection con = AccountConnectionDB.getInstance().getConnection();
				
				
				String changeFirstName = "{call change_firstName(?,?)}";
				CallableStatement cstmt =  con.prepareCall(changeFirstName); 
			
				System.out.print("\nInsert Intern ID: ");
//				internID = Integer.parseInt(input.nextLine());
				id.setStudentID(Integer.parseInt(input.nextLine()));
				internID = id.getStudentID();
				System.out.print("Insert New First Name: ");
				String newfname = input.nextLine();
				
				cstmt.setInt(1, Integer.valueOf(internID));
				cstmt.setString(2, String.valueOf(newfname));
				cstmt.executeUpdate();
				
				System.out.print("\nDo you want to change your last name? (Y/N) ");
				String ans = input.nextLine();
				
				if (ans.equalsIgnoreCase("Y")) {
					change_LastName.change_lname(ans);				
					}
				else if (ans.equalsIgnoreCase("N")) {
					System.out.println("Okay, Thank you for using the program!");
					}
				else {
					System.out.println("There was an error in inserted selection, Please try again!");
					input.nextLine();
					}

				System.out.println("NEW FIRST NAME: " + cstmt.getString(2));
		
				input.close();
				con.close();	
				
			} catch (Exception e) {
				System.out.println("Error Connecting to SQL!");
				e.printStackTrace();	
				}
			
		}
}
