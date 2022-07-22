package training.talentpool.javafundamentals101;

public class myFunctions {
//    static void Fullname(String name) {
//        System.out.println("Welcome " + name + " to Hydra University!");
//        System.out.println("You can now avail university services!");
//    }
//
//    static void StudentID(String name){
//        System.out.println("\nGreetings! Student Number " + name + "!");
//    }
//    
//    static double milesToKm(Double miles){
//    	double km = (1.609 * miles);
////        System.out.println("Distance in kilometers: " + km);
//        return km;
//    }
//	
//	static void rightTriangle(int num) {
//		int a, b;
//		for(a = 0; a < num; a++) {
//            for(b = 0; b <= a; b++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//  	}
//	
//	static void workingSalary (Double dailyRate){
//	    double salaryRate = (dailyRate);
//	     System.out.println("Your daily rate: " + salaryRate);
//	    }
		
	static void char_count(String wordlength) {
		char[] ch = wordlength.toCharArray();
		int letter = 0;
		for(int i = 0; i < wordlength.length(); i++){
			Character.isLetter(ch[i]);{
				letter ++ ;
			}
			System.out.print(letter);
		}
}}