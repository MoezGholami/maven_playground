import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testConcat() {
        String a = "aaa", b = "bbb", expected = a+b;
        assertEquals(expected, StringCalculator.concat(a,b));
    }

    @Test
    public void testStringAdd() {
        testValidIntegerStringAddition(1,15);
        testValidIntegerStringAddition(1,10);
        testValidIntegerStringAddition(-1,10);
        testValidIntegerStringAddition(-10,1);
        testValidIntegerStringAddition(-1,1);
    }

    private void testValidIntegerStringAddition(Integer x, Integer y) {
        Integer z = x + y;
        assertEquals(z.toString(), StringCalculator.addIntgerStrings(x.toString(),y.toString()));
    }
}
