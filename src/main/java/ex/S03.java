package ex;

//import java.util.Scanner;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		//Scanner input = new Scanner(System.in);
		if (value>0) {
			return"positive";
		}
		else if (value<0) {
			return"negative";
		}
		else {
			return "zero";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		return (value%2!=0);
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		if (value >= 0 && value<=9 ) {
			return names[value];
		}else {
			return "other";
		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if(percentile<=50) {
			return 'F';
		}else if(percentile> 50 && percentile<=60){
			return 'E';
		}else if(percentile> 60 && percentile<=70) {
			return 'D';
		}else if(percentile> 70 && percentile<=80) {
			return 'C';
		}else if(percentile> 80 && percentile<=90) {
			return 'B';
		}else if(percentile> 90 && percentile<=100) {
			return 'A';
		}else {
			return 'X';
		}
		
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year  // sono divisibili per 4;
	 */
	public static boolean isLeapYear(int year) {
		if(year>0 && ((year%4==0 && year%100!=0)||(year%100==0 && year%400==0))) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		
		result[0] =  Math.min(Math.min(a, b), Math.min(b, c));
		result[2] =  Math.max(Math.max(a, b), Math.max(b, c));
		
		int[] numbers = {a, b, c};
		for (int item : numbers){
			if (item!=result[0] && item!=result[2]) {
				result[1] = item;
			}
		}
		return result;
	}
}
