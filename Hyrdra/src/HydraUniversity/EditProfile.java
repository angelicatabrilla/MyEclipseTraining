package HydraUniversity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class EditProfile {
	static void change_fname(String change_fname) {
		
		Scanner input = new Scanner(System.in);
		
		ClassID id = new ClassID();
		int internID;

	//CHANGE FIRST NAME
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			String changeFirstName ="";
			String newfname = "";
			String ans = "";
			
			changeFirstName = "{call change_firstName(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeFirstName); 
		
			System.out.print("\nInsert Intern ID: ");
			id.setStudentID(Integer.parseInt(input.nextLine()));
			internID = id.getStudentID();
			System.out.print("Insert New First Name: ");
			newfname = input.nextLine();
			
			cstmt.setInt(1, Integer.valueOf(internID));
			cstmt.setString(2, String.valueOf(newfname));
			cstmt.executeUpdate();
			
			System.out.print("\nDo you want to change your last name? (Y/N) ");
			ans = input.nextLine();
			
			if (ans.equalsIgnoreCase("Y")) {
				EditProfile.change_lname(ans);				
			} else if (ans.equalsIgnoreCase("N")) {
				System.out.println("Okay, Thank you for using the program!");
			} else {
				System.out.println("Please Enter a valid selection!");
				EditProfile.change_fname(ans);
			}

			System.out.println("NEW FIRST NAME: " + cstmt.getString(2));
	
			input.close();
			con.close();	
			
		} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
		
	}
	
	
	//CHANGE LAST NAME
		static void change_lname(String change_lname) {
				
			ClassID id = new ClassID();
			int internID;
				
			Scanner input = new Scanner(System.in);
				
				
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
					
			String changeLastName ="";
			String newlname = "";
			String ans = "";	
			
			changeLastName= "{call change_lastName(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeLastName); 
					
			internID = id.getStudentID();
			System.out.print("Insert New Last Name: ");
			newlname = input.nextLine();
					
					
			cstmt.setInt(1, Integer.valueOf(internID));
			cstmt.setString(2, String.valueOf(newlname));
			cstmt.executeUpdate();
					
			System.out.print("\nDo you want to change your Year level? (Y/N) ");
			ans = input.nextLine();
					
			if (ans.equalsIgnoreCase("Y")) {
				EditProfile.change_yearlevel(ans);				
			} else if (ans.equalsIgnoreCase("N")) {
				System.out.println("Okay, Thank you for using the program!");
			} else {
				System.out.println("Please enter a valid selection!");
				EditProfile.change_lname(ans);
			}
			
			System.out.println("\nNEW LAST NAME: " + cstmt.getString(2));
			
				input.close();
				con.close();	
			
		} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}
			
			
			
	//CHANGE YEAR LEVEL
		static void change_yearlevel(String change_yearlevel) {
			
				
		ClassID id = new ClassID();
		int internID;
				
		Scanner input = new Scanner(System.in);
		
		String changeYearLevel = "";
		String newyearlevel = "";
				
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
					
			changeYearLevel = "{call change_yearlevel(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeYearLevel); 
					
			internID = id.getStudentID();
			System.out.print("Insert New Year Level: ");
			newyearlevel = input.nextLine();
					
			cstmt.setInt(1, Integer.valueOf(internID));
			cstmt.setString(2, String.valueOf(newyearlevel));
			cstmt.executeUpdate();
			System.out.print("\nNEW YEAR LEVEL: " + cstmt.getString(2));
			
				input.close();
				con.close();	
					
		} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}			
}
