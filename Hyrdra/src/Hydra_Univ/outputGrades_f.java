package Hydra_Univ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class outputGrades_f {
	
	
	public static void main(String[] args)
	        throws IOException
	    {
	        // list that holds strings of a file
	        List<String> listOfStrings
	            = new ArrayList<String>();
	       
	        // load data from file
	        FileReader fr = new FileReader( "D:\\Documents\\ECLIPSE\\eclipse-workspace\\Hyrdra\\src\\Hydra_Univ\\grades.txt");
	       
	        // Created a string to store each character
	        // to form word
	        String s = new String();
	        char ch;
	       
	        // checking for EOF
	        while (fr.ready()) {
	            ch = (char)fr.read();
	               
	            // Used to specify the delimiters
	            if (ch == ',') {
	               
	                // Storing each string in arraylist
	                listOfStrings.add(s.toString());
	               
	                // clearing content in string
	                s = new String();
	            }
	            else {
	                // appending each character to string if the
	                // current character is not delimiter
	                s += ch;
	            }
	        }
	        if (s.length() > 0) {
	           
	            // appending last line of strings to list
	            listOfStrings.add(s.toString());
	        }
	        // storing the data in arraylist to array
	        String[] array  = listOfStrings.toArray(new String[0]);
	       
	        // printing each line of file which is stored in
	        // array
	        for (String str : array) {
	            System.out.println(str + " = ");
	        }
	    }
	}
	
	
	
	
	
	
	
	
	

//		 public static void main(String[] args) throws Exception {
//
//			String file = "D:\\Documents\\ECLIPSE\\eclipse-workspace\\Hyrdra\\src\\Hydra_Univ\\grades.txt"; 
//			 
//			    List<String> lines = Collections.emptyList();
//			    try {
//			      lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
//			    } catch (IOException e) {
//			      // TODO Auto-generated catch block
//			      e.printStackTrace();
//			    }
//
//			    BufferedReader bufReader = new BufferedReader(new FileReader(file));
//			    ArrayList<String> listOfLines = new ArrayList<>();
//
//			    String a = bufReader.readLine();
//			    int i=0;
//
//			    while(i<1000 && a != null) {
//			    	System.out.println(a);
//			    	a = bufReader.readLine();
//			    	i++;
//			    }
//			    
//		
//			    bufReader.close();
//
//
//			}		