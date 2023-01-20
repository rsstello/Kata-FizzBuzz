package FizzzBuzz;
import FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {



    @Test
    public void testFizzBuzzNoChange() {

        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
        assertThat(FizzBuzz.convert(2)).isEqualTo("2");
    }

    @Test
    public void testFizzBuzzReplyFizz() {
        assertThat(FizzBuzz.convert(3)).isEqualTo("Fizz");
    }

    @Test
    public void testFizzBuzzReplyBuzz() {
        assertThat(FizzBuzz.convert(5)).isEqualTo("Buzz");
    }

    @Test
    public void testFizzBuzzReplyFizzBuzz() {
        assertThat(FizzBuzz.convert(15)).isEqualTo("FizzBuzz");
    }
}
