package s065;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    void negateException() {
        Simple simple = new Simple();

        try {
            simple.negate(Integer.MIN_VALUE);
        } catch (IllegalArgumentException iae) {
            String message = iae.getMessage();
            assertThat(message, is("Can't negate MIN_VALUE"));
            return; //necessario per interrompere il test e non farlo fallire.
        }
        fail("An IllegalArgumentException was expected");
    }
}
