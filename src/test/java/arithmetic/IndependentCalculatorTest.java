package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndependentCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(7, IndependentCalculator.add(3,4));
        assertEquals(7, IndependentCalculator.add(8,-1));
        assertEquals(0, IndependentCalculator.add(1,-1));
        assertEquals(1, IndependentCalculator.add(0,1));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, IndependentCalculator.multiply(3,4));
        assertEquals(-8, IndependentCalculator.multiply(8,-1));
        assertEquals(5, IndependentCalculator.multiply(5,1));
        assertEquals(1, IndependentCalculator.multiply(-1,-1));
        assertEquals(0, IndependentCalculator.multiply(-8,0));
    }
}
