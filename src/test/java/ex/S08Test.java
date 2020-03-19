package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S08Test {

	@Test
	void testBinarySum() {
		fail("Not yet implemented");
	}

	@Test
	void testMergeSorted() {
		int[] left = { 1, 2, 4, 6, 7 };
		int[] right = { 3, 4, 4, 6 };

		int[] actual = S08.mergeSorted(left, right);
		int[] expected = {1,2,3,4,4,4,6,6,7};
		
		assertThat(actual, is(expected));
	}
	
	@Test
	void testMergeSortedZero() {
		int[] left = { 0 };
		int[] right = {  0 };

		int[] actual = S08.mergeSorted(left, right);
		int[] expected = {0, 0};
		
		assertThat(actual, is(expected));
	}

	@Test
	void testGetSingle() {
		int[] values = {1,4,2,3,3,2,1}; //-> 4
		int actual = S08.getSingle(values);
		
		assertThat(actual, is(4));
	}
	

	@Test
	void testHasOnlyUnique() {
		fail("Not yet implemented");
	}

	@Test
	void testIsAnagram() {
		fail("Not yet implemented");
	}

}
