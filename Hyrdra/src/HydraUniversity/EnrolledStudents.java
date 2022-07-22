package HydraUniversity;

import java.sql.*;
import java.util.Scanner;

public class EnrolledStudents {
	static void enrolled (String enrolled) {

		 
	Scanner input = new Scanner(System.in);
		 
	try {			
		Connection con = AccountConnectionDB.getInstance().getConnection();
				
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM interns LEFT JOIN registration ON "
				+ "registration.studentID = interns.id LEFT JOIN subject ON subject.id = "
				+ "registration.subjectID");
		
		System.out.println("\n+---------------+----------------------------+--------------+-------------------+");
		System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     |  YEAR LEVEL  |  SUBJECT NAME     |"); 
		System.out.println("+---------------+----------------------------+--------------+-------------------+");
		
		while (rs.next()) {
			System.out.print(String.format("%10s",rs.getInt("id")));
			System.out.print(String.format("%30s",rs.getString("firstname") + " " +rs.getString("lastname")));
			System.out.print(String.format("%15s",rs.getInt("yearSection")));
			System.out.println(String.format("%20s",rs.getString("name")));
		}
			
					
		con.close();
		input.close();
		
	} catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();	
		}
	
	}
}