package forInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTester {
    @Test
    public void testAdd() {
        testAddOfAPair(1, 2);
        testAddOfAPair(1, -2);
        testAddOfAPair(1, 0);
    }

    @Test
    public void testIncrement() {
        testIncrementOfANumber(-1);
        testIncrementOfANumber(-2);
        testIncrementOfANumber(0);
    }

    private void testAddOfAPair(int x, int y) {
        assertEquals(x+y, Adder.add(x,y));
    }

    private void testIncrementOfANumber(int x) {
        assertEquals(x+1, Adder.increment(x));
    }
}
