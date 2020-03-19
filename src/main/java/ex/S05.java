package ex;

public class S05 {
	public static void main(String[] args) {
//		int[] array = {1, 2, 3};
//		System.out.println(S05.bin2dec("1001"));
//		System.out.println(S05.reverse(array));

	}

	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		StringBuilder reverse = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}
		return reverse.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		if (s == null || s.isEmpty()) {
			return false;
		}
		String rev = S05.reverse(s);

		return (s.equals(rev)); // non si può usare uguale perchè si confrontano le references e non gli
								// oggetti, quindi saranno diversi.
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {

		StringBuilder sb = new StringBuilder(s);
		String voc = "aeiouAEIOU";

		for (int i = 0; i < sb.length(); i++) {
			if (voc.indexOf(sb.charAt(i)) != -1) {
				sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		
		int num = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				num += Math.pow(2, i);
			}
		}
		return num;
	}

	    // 1 0 0 0 1
//pow   // 4     3  2  1   0
//base	// 1*2^4         + 1*2^0

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		
		int[] result = new int[data.length];
		
		for (int i = data.length - 1; i >= 0; i--) {
			result[data.length-i-1] = data[i];
		}
		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		if (data == null || data.length==0) {
			return 0;
		}
		
		double sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		return sum/(data.length);
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		if (data == null || data.length==0) {
			return '?';
		}
		
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
