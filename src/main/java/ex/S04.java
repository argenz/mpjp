package ex;

import java.util.Arrays;

public class S04 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(multiplicationTable2(3)));
	}
	
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		int sum = 0;
		for (int i = first; i < last + 1; i++) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int sum = 0;
		for (int i = first; i < last + 1; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		
		if (value > 0) {
			int factorial = 1;
			for (int i = value; i > 0 ; i--) {
				factorial *= i;
			}
			return factorial;
		} else {
			return 0L;
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		
		//si può fare anche senza arrays. 
		
		long[] fibonacciArray = new long[value+1];
		fibonacciArray[0] = 0L;
		fibonacciArray[1] = 1L;
		
		for(int i=2; i<=value; i++) {
			fibonacciArray[i] =  fibonacciArray[i-1] + fibonacciArray[i-2];	
		}
		return fibonacciArray[value];
	}
	
	// fatto senza arrays
	public static long fibonacci2(int value) {
			
			
			long fibOld = 0;
			long fib = 1;
	
			for(int i=2; i<=value; i++) {
				long temp = fibOld;
				fibOld = fib;
				fib = fibOld + temp;	
			}
			return fib;
		}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		
		// 1xValue array
		
		int[][] result = new int[1][11];
		
		for (int i = 0; i < 11; i++) {
			result[0][i] = i * value;
		}
		return result;

	}		

	public static int[][] multiplicationTable2(int value){	
		
		// ValuexValue array
		int[][] result = new int[value][value]; 
		
		for (int i=1; i<=value; i++){
			for(int j=1; j<=value; j++){
				result[i-1][j-1] = i*j;        //meglio senza zeri per memoria, indirizzabile e comprensibile 
			}
		}
		return result;
	}
	
	}
//
