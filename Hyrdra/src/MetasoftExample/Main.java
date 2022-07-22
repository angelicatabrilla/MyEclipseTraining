package MetasoftExample;

import java.util.Scanner;
import static java.lang.System.out;
import java.security.*;

public class Main {
	public static void main(String[]args) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
		MyFunctions func = new MyFunctions();
		
		do {
			System.out.println("\n+----------------------------------------------------------------------+");
			System.out.println("\tAVAILABLE FUNCTIONS          ");
			System.out.println
			(" 1 - Convert mile/s to kilometer/s"
				+ "\n 2 - Convert centimeter/s to feet, and feet to inche/s"
				+ "\n 3 - Convert pound/s to grams"
				+ "\n 4 - Convert hour/s to remaining week/s, day/s, and hour/s"
				+ "\n 5 - Convert second/s to time (hh:mm:ss)"
				+ "\n 6 - Convert day/s to remaining year/s, month/s, and day/s"
				+ "\n 7 - Convert the supplied number to double, square, and half"
				+ "\n 8 - Accept two integers and convert the sum to halve/s, quarter, double, and square"
				+ "\n 9 - Convert pint to gill/s, gill/s to quart/s, and quart/s to gallon"
				+ "\n 10 - Convert radius to diameter, circumference, and area"
				+ "\n 11 - Convert diameter to radius, area, circumference, and volume"
				+ "\n 12 - Calculate the area of the triangle with the given base and height"
				+ "\n 13 - Calculate the area of retangle with the given length and width"
				+ "\n 14 - Calculate the earning per day of employee with the "
							+ "\n\tgiven total salary and day/s of worked"
				+ "\n 15 - Calculate the price per liter with the given price and liter/s"
				+ "\n 16 - Calculate the price per soap with the given price and quantity"
				+ "\n 17 - Calculate the total sold ticket and donation of both adult and  "
							+ "\n\tchild ticket sold for a movie with the given movie title,"
							+ "\n\tadult and child ticket price, sold ticket for adult and"
							+ "\n\tchild and donation percentage"
				+ "\n 18 - Accept 5 candidates and the number of vote/s per candidate, "
							+ "\n\tthen calculate the total number of votes and the percentage also "
							+ "\n\treturn number of vote/s per candidate and percentage "
				+ "\n 19 - Shorten System.out.print to print"
				+ "\n 20 - Encrypt string to md5 hash");
			System.out.print("Choose a function: ");
			String service = input.nextLine();
			System.out.println("+----------------------------------------------------------------------+");

			
			switch (service) {    
				case "1":
					System.out.print("\nEnter the Distance in Miles: ");
					Double miles = input.nextDouble();
					MyFunctions.milesToKm(miles);
					System.out.format("Distance in kilometers: " + "%.3f", MyFunctions.milesToKm(miles));
					break;
	       
				case "2":
					System.out.print("\nEnter value of Centimeter: ");
					Double cm = input.nextDouble();
					MyFunctions.feetToInch(cm);
					MyFunctions.cmToFeet(cm);
					System.out.format("CENTIMETERS TO FEET: " + "%.4f", MyFunctions.cmToFeet(cm));
					System.out.format("\nFEET TO INCHES: " + "%.2f", MyFunctions.feetToInch(cm));			
					break;
	       
				case "3":
					System.out.print("\nEnter the Value of Pounds: ");
					Double pounds = input.nextDouble();
					MyFunctions.lbTog(pounds);
					System.out.format("Value in Grams: " + "%.2f", MyFunctions.lbTog(pounds));
					break;
					
					
				case "4":
					System.out.print("\nInput Hours: ");
					long hours = input.nextLong();
					MyFunctions.timeweek(hours);
					System.out.println("Remaining week/s: " +  MyFunctions.timeweek(hours));
					MyFunctions.timedays(hours);
					System.out.println("Remaining day/s: " +  MyFunctions.timedays(hours));
					MyFunctions.timehours(hours);
					System.out.println("Remaining hour/s: " +  MyFunctions.timehours(hours));
					break;
					
					
				case "5":
					System.out.print("\nInput Seconds: ");
					long seconds = input.nextLong();
					MyFunctions.timehour(seconds);
					MyFunctions.timeminutes(seconds);
					MyFunctions.timeseconds(seconds);
					System.out.println(MyFunctions.timehour(seconds) + ":" + MyFunctions.timeminutes(seconds) + ":" + MyFunctions.timeseconds(seconds));
					break;
					
				case "6":
					System.out.print("\nInput Number of Days: ");
					long days = input.nextLong();
					MyFunctions.year(days);
					MyFunctions.month(days);
					MyFunctions.dayss(days);
					System.out.println("Number of Year/s: " + MyFunctions.year(days));
					System.out.println("Number of Month/s: " + MyFunctions.month(days));
					System.out.println("Number of Day/s: " + MyFunctions.dayss(days));
					break;
				
				case "7":
					System.out.print("\nInput a Number: ");
					Double num = input.nextDouble();
					MyFunctions.doublenum(num);
					MyFunctions.square(num);
					System.out.format("Number in Double: " + "%.0f", MyFunctions.doublenum(num));
					System.out.format("\nNumber in Square: " + "%.0f", MyFunctions.square(num));
					System.out.format("\nNumber in Half: " + "%.0f", MyFunctions.half(num));
					break;
					
				case "8":
					System.out.print("\nInput First Number: ");
					Double num1 = input.nextDouble();
					System.out.print("Input Second Number: ");
					Double num2 = input.nextDouble();
					MyFunctions.twonumbers(num1, num2);
					MyFunctions.halfofTwo(num1, num2);
					MyFunctions.quarterofTwo(num1, num2);
					MyFunctions.doubleofTwo(num1, num2);
					MyFunctions.squareofTwo(num1, num2);
					System.out.format("Sum of two(2) numbers: " + "%.0f", MyFunctions.twonumbers(num1, num2));
					System.out.format("\nHalf of two(2) numbers: " + "%.0f",  MyFunctions.halfofTwo(num1, num2));
					System.out.format("\nQuarter of two(2) numbers: " + "%.0f", MyFunctions.quarterofTwo(num1, num2));
					System.out.format("\nDouble of two(2) numbers: " +  MyFunctions.twonumbers(num1, num2));
					System.out.format("\nDouble of two(2) numbers(add): " +  "%.0f", MyFunctions.doubleofTwo(num1, num2));
					System.out.format("\nSquare of two(2) numbers: " + "%.0f",MyFunctions.squareofTwo(num1, num2));
					break;
					
				case "9":
					System.out.print("\nInput Value of Pint: ");
					Double pint = input.nextDouble();
					MyFunctions.gills(pint);
					MyFunctions.quartz(pint);
					MyFunctions.gallon(pint);
					System.out.format("Pint to Gill/s: " + "%.0f", MyFunctions.gills(pint));
					System.out.print("\nGills to Quarts: " + MyFunctions.quartz(pint));
					System.out.format("\nQuarts to Gallon: " + "%.2f", MyFunctions.gallon(pint));
					break;
				
				case "10":
					System.out.print("\nInput Value of Radius: ");
					double radius = input.nextDouble();
					MyFunctions.diameter(radius);
					MyFunctions.circumference(radius);
					MyFunctions.area(radius);
					System.out.format("Radius to Diameter: " + "%.2f", MyFunctions.diameter(radius));
					System.out.format("\nRadius to Circumference: " + "%.2f", MyFunctions.circumference(radius));
					System.out.println("\nArea: " + MyFunctions.area(radius));
					break;
					
				case "11":
					System.out.print("\nInput Value of Diameter: ");
					double diameter = input.nextDouble();
					MyFunctions.radius(diameter);
					MyFunctions.inarea(diameter);
					MyFunctions.incircum(diameter);
					MyFunctions.involume(diameter);
					System.out.format("In Radius: " + "%.2f", MyFunctions.radius(diameter));
					System.out.println("\nIn Area: " + MyFunctions.inarea(diameter));
					System.out.format("In Circumference: " + "%.2f", MyFunctions.incircum(diameter));
					System.out.format("\nIn Volume: " + "%.2f", MyFunctions.involume(diameter));
					break;	
					
				case "12":
					System.out.print("\nInput base: ");
					int base = input.nextInt();
					System.out.print("Input height: ");
					int height = input.nextInt();
					MyFunctions.triangle(base,height);
					System.out.println("Area of triangle: "+MyFunctions.triangle(base,height));
					break;	
					
				case "13":
					System.out.print("\nInput length: ");
					float length = input.nextFloat();
					System.out.print("Input width: ");
					float width = input.nextFloat();
					MyFunctions.rectangle(length,width);
					System.out.println("Area of rectangle: "+MyFunctions.rectangle(length,width));

				case "14":
					System.out.print("\nInput Total Salary: ");
					float salary = input.nextFloat();
					System.out.print("Input Day/s of worked: ");
					float daywork = input.nextFloat();
					MyFunctions.earnings(salary,daywork);
					System.out.println("Earnings per day: "+MyFunctions.earnings(salary,daywork));
					break;	
					
				case "15":
					System.out.print("\nInput Total Liter/s Price: ");
					float price = input.nextFloat();
					System.out.print("Input Liter/s: ");
					float liters = input.nextFloat();
					MyFunctions.perliters(price,liters);
					System.out.println("Price per liter: "+MyFunctions.perliters(price,liters));
					break;	
					
				case "16":
					System.out.print("\nEnter soap price: ");
					Double pricesoap = input.nextDouble();
					System.out.print("Enter how many pieces: ");
					Double quantity = input.nextDouble();
					MyFunctions.priceOfSoap(pricesoap,quantity);
					System.out.println("Total: " + MyFunctions.priceOfSoap(pricesoap,quantity));
					break;
					
				case "17":
					System.out.print("\nInput movie name: ");
					String moviename = input.nextLine();
					System.out.print("");
					System.out.print("Enter Adult Ticket Price: ");
					Double adultprice = input.nextDouble();
					System.out.print("");
					System.out.print("Enter Child Ticket Price: ");
					Double childprice = input.nextDouble();
					System.out.print("");
					System.out.print("Enter the number of adult tickets sold: ");
					Double adultTicketSold = input.nextDouble();
					System.out.print("");
					System.out.print("Enter the number of child tickets sold: ");
					Double childTicketSold = input.nextDouble();
					System.out.print("");
					System.out.print("Enter the percentage of the donation: ");
					Double grossdonation = input.nextDouble();
					
					MyFunctions.totalamount(adultprice,adultTicketSold,childprice,childTicketSold); 
					MyFunctions.tickets(adultTicketSold, childTicketSold); 
					MyFunctions.totalDonation(adultprice,adultTicketSold,childprice,childTicketSold,grossdonation);
					
					System.out.println("+----------------------------------------------------------------------+");
					System.out.println("\tMovie Name:.................................... " + moviename);
					System.out.format("\tNumber of Tickets Sold:........................ " + "%.0f",MyFunctions.tickets(adultTicketSold, childTicketSold));
					System.out.format("\n\tGross Amount:.................................. " + "%.2f",MyFunctions.totalamount(adultprice,adultTicketSold,childprice,childTicketSold));
					System.out.format("\n\tPercentage of Gross Amount Donated:     " + "%.2f", grossdonation);
					System.out.format("\n\tAmount Donated:................................ " + "%.2f",MyFunctions.totalDonation(adultprice,adultTicketSold,childprice,childTicketSold,grossdonation));
					System.out.println("\n+----------------------------------------------------------------------+");
					
					break;	
					
				case "18":
					System.out.print("\nInput 1st Candidate: ");
					String candidate1 = input.nextLine();
					System.out.print("Input 1st Candidate Votes: ");
					float votes1 = input.nextInt();
					System.out.println("");
					
					input.nextLine();
					System.out.print("Input 2nd Candidate: ");
					String candidate2 = input.nextLine();
					System.out.print("Input 2nd Candidate Votes: ");
					float votes2 = input.nextInt();
					System.out.println("");
					
					input.nextLine();
					System.out.print("Input 3rd Candidate: ");
					String candidate3 = input.nextLine();					
					System.out.print("Input 3rd Candidate Votes: ");
					float votes3 = input.nextInt();
					System.out.println("");
					
					input.nextLine();
					System.out.print("Input 4th Candidate: ");
					String candidate4 = input.nextLine();	
					System.out.print("Input 4th Candidate Votes: ");
					float votes4 = input.nextInt();
					System.out.println("");
					
					input.nextLine();
					System.out.print("Input 5th Candidate: ");
					String candidate5 = input.nextLine();
					System.out.print("Input 5th Candidate Votes: ");
					float votes5 = input.nextInt();
					
					MyFunctions.totalvoteCount(votes1,votes2,votes3,votes4,votes5); 
					MyFunctions.totalPercentage1(votes1,votes2,votes3,votes4,votes5); 
					MyFunctions.totalPercentage2(votes1,votes2,votes3,votes4,votes5); 
					MyFunctions.totalPercentage3(votes1,votes2,votes3,votes4,votes5); 
					MyFunctions.totalPercentage4(votes1,votes2,votes3,votes4,votes5); 
					MyFunctions.totalPercentage5(votes1,votes2,votes3,votes4,votes5); 
					
					System.out.println("");
					System.out.println("Total number of Votes: " + MyFunctions.totalvoteCount(votes1,votes2,votes3,votes4,votes5));
					System.out.println("\n1st Candidate: "+candidate1+ "\n\tNumber of votes: " + votes1 + "\n\tVote Percentage: " + MyFunctions.totalPercentage1(votes1,votes2,votes3,votes4,votes5) + "%");
					System.out.println("2nd Candidate: " +candidate2+ "\n\tNumber of votes: " + votes2 + "\n\tVote Percentage: " + MyFunctions.totalPercentage2(votes1,votes2,votes3,votes4,votes5) + "%");
					System.out.println("3rd Candidate: " +candidate3+ "\n\tNumber of votes: " + votes3 + "\n\tVote Percentage: " + MyFunctions.totalPercentage3(votes1,votes2,votes3,votes4,votes5) + "%");
					System.out.println("4th Candidate: " +candidate4+ "\n\tNumber of votes: " + votes4 + "\n\tVote Percentage: " + MyFunctions.totalPercentage4(votes1,votes2,votes3,votes4,votes5) + "%");
					System.out.println("5th Candidate: " +candidate5+ "\n\tNumber of votes: " + votes5 + "\n\tVote Percentage: " + MyFunctions.totalPercentage5(votes1,votes2,votes3,votes4,votes5) + "%");
					break;	
					
				case "19":
					out.print("\nWhat's your name? ");
					String name = input.nextLine();				
					out.println("Hello " + MyFunctions.name(name) + "!");
					
					break;	
					
				case "20": 
					System.out.print("\nEnter message here: ");
					String message = input.nextLine();
					MyFunctions.getMd5(message);
				    System.out.println("Your HashCode Generated by MD5 is: \n\t" + MyFunctions.getMd5(message));
					break;	
					
					
				default:
					System.out.println("The function you choose is not in the selection! Please try again!");
					break;
			}
			
			
			System.out.println("\n+----------------------------------------------------------------------+");
			System.out.println("\nDo you want to view available functions again?");
			System.out.println("Type YES to continue.");
			input.nextLine();
			}
			while (input.nextLine().equalsIgnoreCase("YES"));
				input.nextLine();
				input.close();
						
		}
}