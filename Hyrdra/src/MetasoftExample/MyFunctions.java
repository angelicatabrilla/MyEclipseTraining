package MetasoftExample;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyFunctions {

	//N0. 1
	static double milesToKm(Double miles){
		double km = (1.609 * miles);
		return km;
	}
	
	//NO. 2
	static double feetToInch(Double feetToInch) {
		double inch = feetToInch * 12;
		return inch;
	}
	static double cmToFeet(Double cmfeet) {
		double feet = 0.0328 * cmfeet;
		return feet;
	}
 	
	//N0. 3
	static double lbTog(Double lb){
		double pounds = (lb * 453.59237);
		return pounds;
	}
	
	//N0. 4
	static long timeweek (long timeweek){
		long week = timeweek % 8064 / 168;
		return week;	 
	}
	static long timedays (long timedays){
		long days = timedays % 168 / 24;
		return days;	 
	}
	static long timehours (long timehours){
		long hours = timehours % 24;
		return hours;	 
	}
		
	//N0. 5
	static long timehour (long timehour){
		long hours = timehour % 86400 / 3600;
		 return hours;	 
	}
	static long timeminutes (long timeminutes){
		 long minutes = timeminutes % 3600 / 60;
		 return minutes;	 
	}
	static long timeseconds (long timeseconds){
		 long sec = timeseconds % 60;
		return sec;
	}
	
	//N0. 6
		static long year (long year){
			long years = year / 365;
			 return years;	 
		}
		static long month (long month){
			 long months = (month % 365)/30;
			 return months;	 
		}
		static long dayss (long dayss){
			 long day = (dayss % 365) % 30;
			return day;
		}
		
	//N0. 7
		static Double doublenum (Double doublenum){
			Double dnum = doublenum + doublenum;
			return dnum;	 
		}
		static Double square (Double square){
			Double squared = square * square;
			return squared;	 
		}
		static Double half (Double half){
			Double hf = MyFunctions.doublenum(half) / 2;
			return hf;	 
		}
		
	//NO. 8
		static Double twonumbers (Double number1, Double number2) {
			Double sum = number1 + number2;
			return sum;
		}
		static Double halfofTwo (Double number1, Double number2) {
			Double half = (number1 + number2)/2;
			return half;
		}
		static Double quarterofTwo (Double number1, Double number2) {
			Double quarter = (number1 + number2)/4;
			return quarter;
		}
		static Double doubleofTwo (Double number1, Double number2) {
			Double doub = (number1 + number2) + (number1 + number2);
			return doub;
		}
		static Double squareofTwo (Double number1, Double number2) {
			Double squared = (number1 + number2) * (number1 + number2);
			return squared;
		}
		
		
	//NO. 9
		static Double gills (Double gills){
			Double gill = gills * 4;
			return gill;	 
		}
		static Double quartz (Double quartz){
			Double quarts = quartz * 0.125;
			return quarts;	 
		}
		static Double gallon (Double gallon){
			Double gall = gallon * 0.25;
			return gall;	 
		}
	
	//NO.10
		static Double diameter (Double diameter) {
			double dradius= (diameter * 2);
				return dradius;	
		}
		static Double circumference (Double circumference) {
			double circum= (circumference * 2) * 3.14;
				return circum;	
		}
		static Double area (Double area) {
			double a = 3.14 * (area * area);
				return a;	
		}
		
	//NO. 11
		static Double radius (Double radius) {
			double dia = (radius / 2);
				return dia;	
		}
		static Double inarea (Double inarea) {
			double diameter = 3.14 * (inarea/2)*(inarea/2);
				return diameter;	
		}
		static Double incircum (Double incircum) {
			double circumference = 2 * 3.14 * MyFunctions.radius(incircum);
				return circumference;	
		}
		static Double involume (Double involume) {
			double volume = (4.0/3.0)* 3.14 * MyFunctions.radius(involume)*MyFunctions.radius(involume)*MyFunctions.radius(involume);
				return volume;	
		}
		

		
	//NO. 12
		static int triangle (int base, int height) {
			int area= (base * height / 2);
			return area;
		}
		
	//NO. 13
		static float rectangle (float length,float width) {
			float area= (length * width);
			return area;
		}
		
	//NO. 14
		static float earnings (float salary,float days ) {
			float e =(salary / days);
			return e;
		}
		
	//NO.15
		static float perliters (float price,float liters) {
			float l=(price / liters);
			return l;
	}
		
	//NO.16
		static double priceOfSoap (Double pricesoap, Double quantity){
			double total = (pricesoap * quantity);
	     return total;
	    }	
		
	//NO.17
		static double totalamount (Double adultprice, Double adultTicketSold, Double childprice, Double childTicketSold){
			double total = (adultprice * adultTicketSold + childprice * childTicketSold);
		return total;
		}	
		static double tickets (Double adultTicketSold, Double childTicketSold){
			double totaltickets = (adultTicketSold + childTicketSold);
		return totaltickets;
		}
		static double totalDonation (Double adultprice, Double adultTicketSold, Double childprice, Double childTicketSold, Double percentage){
			double donations = MyFunctions.totalamount(adultprice,adultTicketSold,childprice,childTicketSold) * percentage /100;
		return donations;
		}
		
		
		
		
		
	//NO.18
		static float totalvoteCount (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalCount = vote1 + vote2 + vote3 + vote4 + vote5;
			return totalCount;
		}
		static float totalPercentage1 (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalPercentage = vote1 / MyFunctions.totalvoteCount(vote1,vote2,vote3,vote4,vote5) * 100;
			return totalPercentage;
		}
		static float totalPercentage2 (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalPercentage = vote2 / MyFunctions.totalvoteCount(vote1,vote2,vote3,vote4,vote5) * 100;
			return totalPercentage;
		}
		static float totalPercentage3 (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalPercentage = vote3 / MyFunctions.totalvoteCount(vote1,vote2,vote3,vote4,vote5) * 100;
			return totalPercentage;
		}
		static float totalPercentage4 (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalPercentage = vote4 / MyFunctions.totalvoteCount(vote1,vote2,vote3,vote4,vote5) * 100;
			return totalPercentage;
		}
		static float totalPercentage5 (float vote1, float vote2, float vote3, float vote4, float vote5 ){
			float totalPercentage = vote5 / MyFunctions.totalvoteCount(vote1,vote2,vote3,vote4,vote5) * 100;
			return totalPercentage;
		}

		
		
	//NO.19
		static String name (String yourname){
			String name = yourname;
			return name;
		}
	
		
		//NO. 20
		static String getMd5(String input)
		    {
		        try {
		  
		            // Static getInstance method is called with hashing MD5
		            MessageDigest md = MessageDigest.getInstance("MD5");
		  
		            // digest() method is called to calculate message digest
		            //  of an input digest() return array of byte
		            byte[] messageDigest = md.digest(input.getBytes());
		  
		            // Convert byte array into signum representation
		            BigInteger no = new BigInteger(1, messageDigest);
		  
		            // Convert message digest into hex value
		            String hashtext = no.toString(16);
		            while (hashtext.length() < 32) {
		                hashtext = "0" + hashtext;
		            }
		            return hashtext;
		        } 
		  
		        // For specifying wrong message digest algorithms
		        catch (NoSuchAlgorithmException e) {
		            throw new RuntimeException(e);
		        }
		    }
}
