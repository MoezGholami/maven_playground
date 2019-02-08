package forDouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {
    @Test
    public void testMultiply() {
        testMultiplyOfAPair(1, 2);
        testMultiplyOfAPair(1, -2);
        testMultiplyOfAPair(-2, -2);
        testMultiplyOfAPair(1, 0);
        testMultiplyOfAPair(1, 1.50);
    }

    @Test
    public void testMakeTwice() {
        testMakeTwiceOfANumber(-1);
        testMakeTwiceOfANumber(-2);
        testMakeTwiceOfANumber(0);
        testMakeTwiceOfANumber(7);
    }

    private void testMultiplyOfAPair(double x, double y) {
        assertEquals(x*y, Multiplier.multiply(x,y));
    }

    private void testMakeTwiceOfANumber(double x) {
        assertEquals(x*2, Multiplier.makeTwice(x));
    }
}
