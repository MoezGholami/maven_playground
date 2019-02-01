package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(7,Calculator.add(3,4));
        assertEquals(7,Calculator.add(8,-1));
        assertEquals(0,Calculator.add(1,-1));
        assertEquals(1,Calculator.add(0,1));
    }

    @Test
    public void testMultiply() {
        assertEquals(12,Calculator.multiply(3,4));
        assertEquals(-8,Calculator.multiply(8,-1));
        assertEquals(5,Calculator.multiply(5,1));
        assertEquals(1,Calculator.multiply(-1,-1));
        assertEquals(0,Calculator.multiply(-8,0));
    }
}
