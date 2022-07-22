package HydraUniversity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Subjects {
	 static void enroll (String enroll) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			 Connection con = AccountConnectionDB.getInstance().getConnection();
				
				java.sql.Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM batch3.interns");
						
				System.out.println("\n+---------------+----------------------------+");
				System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     |");
				System.out.println("+---------------+----------------------------+");
						
				while (rs.next()) {
					System.out.print("      "+ rs.getInt("id"));
					System.out.println("         "+rs.getString("firstname") + " " +rs.getString("lastname"));
				}
				
				System.out.println("+---------------------+");
				System.out.println("|  AVAILABLE SUBJECTS |");
				System.out.println("+---------------------+");
				
				System.out.println(" 1 - Filipino\n 2 - English\n 3 - Math\n 4 - Christian Living"
                        + "\n 5 - Hekasi\n 6 - MAPEH\n 7 - Science\n 8 - TLE");
				
							
				String updateQuery = "INSERT INTO batch3.registration (studentID, subjectID) VALUES (?,?)";
				PreparedStatement pstmt = con.prepareStatement(updateQuery);	
										
				System.out.print("\nInput your Student ID: ");
				String studentID = input.nextLine();
				System.out.print("Input subject you want to enroll: ");
				String subjectID = input.nextLine();
				
				System.out.print("\nAre you sure you want to enroll to this subject? (Y/N) ");
				String ans = input.nextLine();
				
				if (ans.equalsIgnoreCase("Y")) {
					pstmt.setString(1,studentID);
					pstmt.setString(2,subjectID);
					pstmt.executeUpdate();
					System.out.println("Welcome student " + studentID + "! You are now officially enrolled to this subject!");
					}
				else if (ans.equalsIgnoreCase("N")) {
					System.out.println("Okay, Thank you for using the program!");
					}
				else {
					System.out.println("Sorry. The subject you choose is not in the selection! Please try again!");
					}
				
			
				con.close();
				input.close();

	}	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
		
		}
	 }
}


