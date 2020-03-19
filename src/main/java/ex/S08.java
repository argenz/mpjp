package ex;

import java.util.Arrays;

import ex.S03;

public class S08 {
	public static void main(String[] args) {
		int[] left = { 1, 4, 2, 3, 3, 2, 1 };
		int[] right = { 4, 18, 7, 1 };
		System.out.println(Arrays.toString(mergeSorted(left, right)));
		System.out.println(getSingle(left));
	}

	/**
	 * Binary addition on strings
	 * 
	 * <pre>
	 * "10" + "11" = "101"
	 * </pre>
	 * 
	 * @param left  binary represented on string
	 * @param right binary represented on string
	 * 
	 * @return left + right as binary on string
	 * @throws IllegalArgumentException different sizes
	 */
	public static String binarySum(String left, String right) {
		throw new UnsupportedOperationException("Not yet implemented");
//		int remainder = 1;
		// while(remainder)

	}

	/**
	 * Merge sorted arrays in a new array still sorted
	 * 
	 * <pre>
	 * [1,2,4,6,7], [3,4,4,6] -> [1,2,3,4,4,4,6,6,7]
	 * </pre>
	 * 
	 * @param left  a sorted array
	 * @param right a sorted array
	 * 
	 * @return a merge of the two input parameters
	 */
	public static int[] mergeSorted(int[] left, int[] right) {
		if ((left == null || left.length == 0) || (right == null || right.length == 0)) {
			throw new UnsupportedOperationException("Arrays cannot be null or empty.");
		}

		int totalLength = left.length + right.length;
		int[] merged = new int[totalLength];
		for (int i = 0; i < left.length; i++) {
			merged[i] = left[i];
		}
		for (int i = 0; i < right.length; i++) {
			merged[left.length + i] = right[i];
		}
		int[] sorted = S03.sortArray(merged);

		return sorted;

	}

	/**
	 * Get the only single value in an array of couples
	 * 
	 * <pre>
	 * [1,4,2,3,3,2,1] -> 4
	 * </pre>
	 * 
	 * @param values an array
	 * 
	 * @return the only single value
	 */
	public static int getSingle(int[] values) {

		for (int i = 0; i < values.length; i++) {
			int count = 0;
			for (int j = 0; j < values.length; j++) {  //is there a way to do it that doesnt search through all the elements? 
				if (values[i] == values[j] && i != j) {
					count++;
				}
			}
			if (count == 0) {
				return values[i];
			}
		}
		throw new UnsupportedOperationException("All values are couples");
	}

	/**
	 * Check for duplicate characters in a string
	 * 
	 * <pre>
	 * "hello" -> false, "helo" -> true
	 * </pre>
	 * 
	 * @param s a string
	 * 
	 * @return true if no duplicates in
	 */
	public static boolean hasOnlyUnique(String s) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Check for anagram
	 * 
	 * @param s
	 * @param t
	 * @return true if s is an anagram of t
	 */
	public static boolean isAnagram(String s, String t) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
