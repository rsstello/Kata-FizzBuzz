package FizzzBuzz;
import FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzzTest {



    @Test
    public void testFizzBuzzNoChange() {

        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
    }

}
