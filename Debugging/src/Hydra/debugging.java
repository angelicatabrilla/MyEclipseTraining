package Hydra;

import java.util.Scanner;

public class debugging {
	public static String numToWords(long number) {
		String result = "";
		long limit = 9999999999999L;
		
		if(number >= limit){
			return "Limit is 999999999999";
		}
		if(number == 0){
			return "Zero";
		}
		if((number / 1000000000) > 0) {
			result += numToWords(number / 1000000000) + "Billion ";
			number %= 1000000000;
		}
		if((number / 1000000) > 0) {
			result += numToWords(number / 1000000) + "Million ";
			number %= 1000000;
		}
		if((number / 1000) > 0) {
			result += numToWords(number / 1000) + "Thousand ";
			number %= 1000;
		}
		if((number / 100) > 0) {
			result += numToWords(number / 100) + "Hundred ";
			number %= 100;
		}
		if(number >= 0) {
			String[] units = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
			String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			if(number < 20) {
				result += units[ (int) number];
			}
			else {
				result += tens[(int) (number / 10)];
				if((number % 10) > 0) {
					result += "-" + units[(int) (number % 10)];
				}
			}
		}
		else {
			result = "Invalid";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = "";
		System.out.print("Enter a number: ");
		long num = scan.nextLong();
		if(num < 0) {
			word = "Negative ";
			num *= -1;
		}
		word += numToWords(num);
        System.out.println(word);
	}
}