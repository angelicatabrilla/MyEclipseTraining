package HydraUniversity;
import java.sql.*;
import java.util.Scanner;

public class StudentLevel {
	 static void yearlevel (String yearlevel) {

		Scanner input = new Scanner(System.in);
		
		try {
			Connection con = AccountConnectionDB.getInstance().getConnection();
			
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM batch3.interns");
					
			System.out.println("\n+---------------+----------------------------+--------------+");
			System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     |  YEAR LEVEL  |");
			System.out.println("+---------------+----------------------------+--------------+");
					
			while (rs.next()) {
				System.out.print(String.format("%10s",rs.getInt("id")));
				System.out.print(String.format("%30s",rs.getString("firstname") + " " +rs.getString("lastname")));
				System.out.println(String.format("%15s",rs.getInt("yearSection")));
			}

			String studentyear = "{? = call InternLevel(?)}";
			CallableStatement cstmt =  con.prepareCall(studentyear); 
			
			
			System.out.print("\nCheck your year level");
			System.out.print("\nInsert Student Year(YYYY): ");
			String studentIn=input.nextLine();
			
			cstmt.setInt(2, Integer.valueOf(studentIn));
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			System.out.println("STUDENT LEVEL: " + cstmt.getString(1));
		
			con.close();
			input.close();
		}
	catch (Exception e) {
		System.out.println("Error Connecting to SQL!");
		e.printStackTrace();
	 }
}
}

