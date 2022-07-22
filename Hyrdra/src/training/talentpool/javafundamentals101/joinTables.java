package training.talentpool.javafundamentals101;
import java.sql.*;
import java.util.Scanner;


public class joinTables {
	public static void main (String[]args) {
		try {			//to catch error, we enter our queries in a try-catch block as discussed in Java 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/metasoft", "root", "Artabrilla9699");
			
//			Statement stmt = con.createStatement();
			String getAge = "{call employees_age()}";
			CallableStatement cstmt =  con.prepareCall(getAge); 
//			
//			Scanner input = new Scanner(System.in);
//			
//			String sql = "{? = call minutes(?,?)}";
//			CallableStatement cstmt =  con.prepareCall(sql); 
//			
//			System.out.print("Start date(YYYY-MM-DD): ");
//			String dateStart = input.nextLine();
//			System.out.print("End date(YYYY-MM-DD): ");
//			String dateEnd = input.nextLine();
//			
//			cstmt.setDate(2, Date.valueOf(dateStart));
//			cstmt.setDate(3, Date.valueOf(dateEnd));
//			cstmt.registerOutParameter(1, Types.INTEGER);
//			cstmt.execute();
//			System.out.println("NUMBER OF MINUTES: " + cstmt.getInt(1));
			
			
//			ResultSet rs = stmt.executeQuery("SELECT interns.id, interns.firstname, interns.lastname, interns.enrolledDate, registration.subjectID, subject.name\r\n"
//					+ "FROM interns\r\n"
//					+ "LEFT JOIN registration\r\n"
//					+ "ON interns.id = registration.studentID \r\n"
//					+ "LEFT JOIN subject \r\n"
//					+ "ON registration.subjectID = subject.id\r\n"
//					+ "ORDER BY interns.id ASC, subjectID ASC");
//			
//
//			System.out.println("----------------+----------------------------+---------------+-------------------------------+");
//			System.out.println("|  STUDENT ID   |      ENROLLED STUDENTS     | ENROLLED DATE |    ID    |      SUBJECTS      |");
//			System.out.println("+---------------+----------------------------+---------------+-------------------------------+");
//			
//			while (rs.next()) {
//				System.out.print(String.format("%10s", rs.getInt("id")));
//				System.out.print(String.format("%32s", rs.getString("firstname") +(" ") +rs.getString("lastname")));
//				System.out.print(String.format("%17s",rs.getDate("enrolledDate")));
//				System.out.print(String.format("%10s",rs.getString("subjectID")));
//				System.out.println(String.format("%23s",rs.getString("name")));
//			}
//			
//			System.out.println("+---------------+----------------------------+---------------+-----------|-------------------+");
			
			
			
//			cstmt.setDate(1, java.sql.Date.valueOf("2000-10-0"));
			ResultSet value = cstmt.executeQuery();

			while (value.next()) {
			System.out.println(value.getInt("employee_id")+" " + value.getString("firstname")+ ", " + value.getInt("age"));
			}
			
			con.close();
			
			
			
		}	catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
		}
	}
}
