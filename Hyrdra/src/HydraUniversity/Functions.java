package HydraUniversity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Functions {
	

//CHANGE YEAR LEVEL
	static void change_yearlevel(String change_yearlevel) {
		Scanner input = new Scanner(System.in);
		 Menu sqlmenu = new Menu();
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			String sdecision = "";
			String changeYearLevel= "{call change_yearlevel(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeYearLevel); 
			
			System.out.print("Insert New Year Level: ");
			String newyearlevel = input.nextLine();
			
			cstmt.setInt(1, 1008);
			cstmt.setString(2, String.valueOf(newyearlevel));
			cstmt.executeUpdate();
			System.out.println("\nNEW YEAR LEVEL: " + cstmt.getString(2));
			System.out.println("\nDo you want to view available services again?");
			System.out.println("Type YES to continue.");
			sdecision = input.nextLine();
			if (sdecision.equalsIgnoreCase("Y")) {
				sqlmenu.menu(sdecision);
			} else {
				System.out.println("Thank you for using the program!");
			}
			
			input.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}	

	
//DELETE A SUBJECT
	static void deleteSubject(String deleteSubject){
		Scanner input = new Scanner(System.in);
		 Menu sqlmenu = new Menu();
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			String sdecision = "";
			String delete_Subject = "{?= call deleteSubject(?)}";
			CallableStatement cstmt =  con.prepareCall(delete_Subject); 
			
			System.out.print("Insert Subject ID: ");
			String deleteID= input.nextLine();
			
			cstmt.setInt(2,Integer.valueOf(deleteID));
			cstmt.execute();
			System.out.println("The Subject is now deleted and all registered students in this subject.");
			System.out.println("\nDo you want to view available services again?");
			System.out.println("Type YES to continue.");
			sdecision = input.nextLine();
			if (sdecision.equalsIgnoreCase("Y")) {
				sqlmenu.menu(sdecision);
			} else {
				System.out.println("Thank you for using the program!");
			}
			
			input.close();
			con.close();
			
	} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}
	
	
//ENROLLED SUBJECTS
	static void enrolledSubjects (String enrolledSubjects) {		 
		Scanner input = new Scanner(System.in);
		 Menu sqlmenu = new Menu();
		 
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
					
			String sdecision = "";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM interns LEFT JOIN registration ON "
					+ "registration.studentID = interns.id LEFT JOIN subject ON subject.id = "
					+ "registration.subjectID");
			
			System.out.println("\n+-------------------------+-------------------+");
			System.out.println("|   ENROLLED STUDENTS     |   SUBJECT NAME    |"); 
			System.out.println("+-------------------------+-------------------+");
			
			while (rs.next()) {
				System.out.print(String.format(" "+"%22s",rs.getString("firstname") + " " +rs.getString("lastname")));
				System.out.println(String.format("%20s",rs.getString("name")));
			}
			
			System.out.println("\nDo you want to view available services again?");
			System.out.println("Type YES to continue.");
			sdecision = input.nextLine();
			if (sdecision.equalsIgnoreCase("Y")) {
				sqlmenu.menu(sdecision);
			} else {
				System.out.println("Thank you for using the program!");
			}
				
						
			con.close();
			input.close();
			
		}	catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
		}
	
//DELETE A STUDENT
	static void deleteStudent(String deleteStudent){
		Scanner input = new Scanner(System.in);
		 Menu sqlmenu = new Menu();
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			String sdecision ="";
			
			String delete_Student = "{?= call deleteStudent(?)}";
			CallableStatement cstmt =  con.prepareCall(delete_Student); 
			
			System.out.print("Insert StudentID: ");
			String delete_ID= input.nextLine();
			
			cstmt.setInt(2,Integer.valueOf(delete_ID));
			cstmt.execute();
			System.out.println("The Student is not now enrolled in this university.");
			 System.out.println("\nDo you want to view available services again?");
				System.out.println("Type YES to continue.");
				sdecision = input.nextLine();
				if (sdecision.equalsIgnoreCase("Y")) {
					sqlmenu.menu(sdecision);
				} else {
					System.out.println("Thank you for using the program!");
				}
			
			input.close();
			con.close();
			
	}
		catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}
}	


