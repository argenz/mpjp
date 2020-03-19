package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S04Test {
	@Test
	void sumPositive() {
		long actual = S04.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumNegPos() {
		long actual = S04.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S04.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S04.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S04.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S04.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S04.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S04.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S04.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S04.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci() {
		
		long actual = S04.fibonacci(5);
		
		assertThat(actual, is(5L));   
	}
	
//	@Test
//	void fibonacciZero() {
//		
//		long actual = S04.fibonacci(0);
//		
//		assertThat(actual, is(0L));   
//	}


	@Test
	void multiplicationTable() {
		
		int[][] actual = S04.multiplicationTable(9);
		
		assertTrue(actual[0][0]==0);
		assertTrue(actual[0][10]==90);
	}
	
	@Test
	void multiplicationTable2() {
		final int INPUT = 3;
		int[][] actual = S04.multiplicationTable2(INPUT);
		
		assertThat(actual.length, is(INPUT)); 			// checking rows 
		assertThat(actual[0].length, is(INPUT));        // checking columns
		assertThat(actual[1].length, is(INPUT));        // check other rows in case the matrix isn't symmetric
		assertThat(actual[2].length, is(INPUT));

		
		
		//assertThat(actual.)
		
		
		
		//diverso
		int[][] expected = {{1, 2, 3},
				            {2, 4, 6}, 
				            {3, 6, 9}};
		
	    assertThat(actual, is(expected));		           
		
	}
	
}