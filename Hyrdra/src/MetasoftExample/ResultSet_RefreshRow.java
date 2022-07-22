package MetasoftExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_RefreshRow {
	public static void main(String[] args) {
		String domain = "jdbc:mysql://localhost:3306/metasoft";
		 String root = "root";
		 String password = "Artabrilla9699";

		
		try {
			 	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(domain, root, password);
			    Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			    st.executeUpdate("create table survey (id int,name varchar(30), PRIMARY KEY(id))");
			    st.executeUpdate("insert into survey (id,name ) values (1,'nameValue')");
			    st.executeUpdate("insert into survey (id,name ) values (2,null)");
			    st.executeUpdate("insert into survey (id,name ) values (3,'Tom')");

			    ResultSet rs = st.executeQuery("SELECT id,name FROM survey");

			    // Use the result set

			    // Retrieve the current values of the row from the database
			    rs.beforeFirst();
			    rs.next();	    
			    rs.refreshRow();


			    rs.close();
			    st.close();
			    con.close();
		}
		catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
			
			}
	  }
}
	