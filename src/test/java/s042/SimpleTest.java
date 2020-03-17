package s042;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import s042.Simple;

class SimpleTest {
    @Test
    public void negatePositive() {				//per eseguire il test servono:
        Simple simple = new Simple();      		//un oggetto
        int value = 42;							//un valore 

        int result = simple.negate(value);		//esegui il metodo 

        assertThat(result, equalTo(-42));		//assicurarsi che il risultato è giusto.
    }
}
