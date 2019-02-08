package forDouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderClassTest {
    @Test
    public void testAdd() {
        testAddOfAPair(1, 2);
        testAddOfAPair(1, -2);
        testAddOfAPair(1, 0);
        testAddOfAPair(1, 1.50);
    }

    @Test
    public void testIncrement() {
        testIncrementOfANumber(-1);
        testIncrementOfANumber(-2);
        testIncrementOfANumber(0);
    }

    private void testAddOfAPair(double x, double y) {
        assertEquals(x+y, Adder.add(x,y));
    }

    private void testIncrementOfANumber(double x) {
        assertEquals(x+1, Adder.increment(x));
    }
}
