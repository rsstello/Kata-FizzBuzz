package FizzzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {



    @Test
    void testFizzBuzzConverterNoChange () {

        final String esperado = "1";
        final String obtido = fizzBuzz.convert(1);
        assertEquals(esperado, obtido);
    }
}
