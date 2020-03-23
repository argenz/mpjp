package ex;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S03Test {

    @Test
    void checkSignPositive() {
        String actual = S03.checkSign(42);

        assertThat(actual, is("positive"));
    }

    @Test
    void checkSignNegative() {
        String actual = S03.checkSign(-42);

        assertThat(actual, is("negative"));
    }

    @Test
    void checkSignZero() {
        String actual = S03.checkSign(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void isOddTrue() {
        boolean actual = S03.isOdd(19);

        assertThat(actual, is(true));
    }

    @Test
    void isOddFalse() {
        boolean actual = S03.isOdd(-12);

        assertThat(actual, is(false));
    }

    @Test
    void asWordZero() {
        String actual = S03.asWord(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void asWordOther() {
        String actual = S03.asWord(42);

        assertThat(actual, is("other"));
    }

    @Test
    void voteLowA() {
        char actual = S03.vote(90.01);

        assertThat(actual, is('A'));
    }

    @Test
    void voteTopB() {
        char actual = S03.vote(90);

        assertThat(actual, is('B'));
    }
    
    @Test
    void voteException() {
    	
    	
    	try { S03.vote(-1); 
    	} 
    	catch (IllegalArgumentException iae) {
    	String message = iae.getMessage();
    	assertThat(message, is("Not a valid score!")); 
    	return;
    	}
    	fail("An IllegalArgumentException was expected"); 
    }
   	
 


    @Test
    void isLeapTrue() throws Exception {
    
    	
        boolean actual = S03.isLeapYear(2020);

        assertThat(actual, is(true));
    }
    

    @Test
    void isLeapFalse() throws Exception{
        boolean actual = S03.isLeapYear(1900);

        assertThat(actual, is(false));
    }
    
    @Test
    void isLeapException() throws Exception{
       
	    try { S03.isLeapYear(10); 
		} 
		catch (Exception iae) {
		String message = iae.getMessage();
		assertThat(message, is("Leap years exist from 1588 onwards!")); 
		return;
		}
		fail("An Exception was expected"); 
    }
    
    @Test
    void sortPlain() {
        int[] actual = S03.sort(3, 2, 1);

        assertThat(actual.length, is(3));
        assertThat(actual[0], is(1));
        assertThat(actual[1], is(2));
        assertThat(actual[2], is(3));
    }
}
