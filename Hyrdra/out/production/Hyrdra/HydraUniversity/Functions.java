package HydraUniversity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Functions {
	
//CHANGE FIRST NAME
	static void change_firstname(String change_firstname) {

		Scanner input = new Scanner(System.in);
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			
			String changeFirstName = "{call change_firstName(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeFirstName); 
		
			System.out.print("\nInsert Intern ID: ");
			int internID = Integer.parseInt(input.nextLine());
//			int internID = input.nextInt();
//			input.nextLine();
			
			System.out.print("Insert New First Name: ");
			String newfname = input.nextLine();
			
			cstmt.setInt(1, Integer.valueOf(internID));
//			cstmt.setInt(1, 1008);
			cstmt.setString(2, String.valueOf(newfname));
			cstmt.executeUpdate();
			System.out.println("\nNEW FIRST NAME: " + cstmt.getString(2));
	
			input.close();
			con.close();	
			
		} catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
		
	}
	
//CHANGE LAST NAME
	static void change_lastname(String change_lastname) {
		Scanner input = new Scanner(System.in);
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			
			String changeLastName= "{call change_lastName(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeLastName); 
			
			System.out.print("Insert New Last Name: ");
			String newlname = input.nextLine();
			
			cstmt.setInt(1, 1008);
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
	

//CHANGE YEAR LEVEL
	static void change_yearlevel(String change_yearlevel) {
		Scanner input = new Scanner(System.in);
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			String changeYearLevel= "{call change_yearlevel(?,?)}";
			CallableStatement cstmt =  con.prepareCall(changeYearLevel); 
			
			System.out.print("Insert New Year Level: ");
			String newyearlevel = input.nextLine();
			
			cstmt.setInt(1, 1008);
			cstmt.setString(2, String.valueOf(newyearlevel));
			cstmt.executeUpdate();
			System.out.println("\nNEW YEAR LEVEL: " + cstmt.getString(2));
	
			input.close();
			con.close();	
	}
		catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}	

	
//DELETE A SUBJECT
	static void deleteSubject(String deleteSubject){
		Scanner input = new Scanner(System.in);
		
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			
			String delete_Subject = "{?= call deleteSubject(?)}";
			CallableStatement cstmt =  con.prepareCall(delete_Subject); 
			
			System.out.print("Insert Subject ID: ");
			String deleteID= input.nextLine();
			
			cstmt.setInt(2,Integer.valueOf(deleteID));
			cstmt.execute();
			System.out.println("The Subject is now deleted and all registered students in this subject.");
			
			input.close();
			con.close();
			
	}
		catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
	}
	
	
//ENROLLED SUBJECTS
	static void enrolledSubjects (String enrolledSubjects) {		 
		Scanner input = new Scanner(System.in);
			 
		try {			
			Connection con = AccountConnectionDB.getInstance().getConnection();
					
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
				
						
			con.close();
			input.close();
			
		}	
			catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();	
			}
		}
	}
	
