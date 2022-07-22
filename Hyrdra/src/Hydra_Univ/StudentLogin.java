package Hydra_Univ;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import HydraUniversity.ClassID;

public class StudentLogin {
	static void studentLogin (String studentLogin){
		
		Scanner scan = new Scanner(System.in);
		
		String filename = "D:\\Documents\\ECLIPSE\\eclipse-workspace\\Hyrdra\\src\\Hydra_Univ\\login.txt";
		
		try {
			Path path = Paths.get(filename.toString());
			InputStream input = Files.newInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String email = "";
			String password = "";
			
			System.out.print("Enter Student Email: ");
			email = scan.nextLine();
			System.out.print("Enter Password: ");
			password = scan.nextLine();
			
			String _temp = null;
			String _email;
			String _pass;
			boolean found = false;
			while ((_temp = reader.readLine()) != null) {
				String[] login = _temp.split(",");
				_email = login [1];
				_pass = login [2];
				
				if(_email.equals(email) && _pass.equals(password)) {
					found = true;
				} 
				else if (_email.equals(email)) {
					System.out.println("Password is incorrect!");
				}
				else if (_pass.equals(password)) {
					System.out.println("Email is incorrect!");
				}
			}
			
			if (found == true) {
				System.out.println("Access Granted!");
			} 
			else {
				System.out.println("Access Denied!");
			}
			
		}
		catch (Exception e) {
			System.out.println("Error Connecting to The File!");
			System.out.println(e.getMessage());
		}
	}
}
