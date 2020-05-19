import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MathTest {

    @Test
    public void calculate() {
        Math math = new Math();

        int actual = math.calculate(1, 1);

        assertThat(actual, is(2));

    }
}