package s037;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


class ExerciseTest2 {

	@Test
	void testCesareMethod() {
		String result = Exercise.cesareMethod("CIAO", 1);
		
		assertThat(result, is("DJBP"));
	
		
	}

}
