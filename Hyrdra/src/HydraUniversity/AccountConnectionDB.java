package HydraUniversity;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccountConnectionDB {

private static AccountConnectionDB instance = null;
private static Connection con;

private AccountConnectionDB() {

	 String domain = "jdbc:mysql://localhost:3306/batch3";
	 String root = "root";
	 String password = "Artabrilla9699";
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(domain, root, password);
                }

                    catch(ClassNotFoundException cnfErr)
                    {cnfErr.printStackTrace();
                    }
        catch (Exception e) {
			System.out.println("Error Connecting to SQL!");
			e.printStackTrace();
                    }
}

public static AccountConnectionDB getInstance() {
	if(instance == null)
		return new AccountConnectionDB();
	else
		return instance;
}
	public static Connection getConnection() {
		return con;
	}
}    