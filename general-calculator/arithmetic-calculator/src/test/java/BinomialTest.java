import org.junit.jupiter.api.Test;
import polynomial.Binomial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinomialTest {
    private static final double AS[] = new double[] {1,  0.5,  0, 7, -1, 3};
    private static final double BS[] = new double[] {9, -0.5, -6, 2, -5, 1};
    private static final double CS[] = new double[] {0, 0.25, -1, 8, -3, 0};

    @Test
    public void testBinomialObjectCreation() {
        for(int i = 0; i < Math.min(Math.min(AS.length, BS.length), CS.length); i++) {
            Binomial b = new Binomial(AS[i], BS[i], CS[i]);
            assertEquals(AS[i], b.getA());
            assertEquals(BS[i], b.getB());
            assertEquals(CS[i], b.getC());
        }
    }

    @Test
    public void testBinomialCalculation() {
        Binomial b;
        for(int i = 0; i < Math.min(Math.min(AS.length, BS.length), CS.length); i++) {
            b = new Binomial(AS[i], BS[i], CS[i]);
            for (double x = -7.0; x <= 7.0; x += 0.1)
                verifyBinomialCalculation(b, x);
        }
    }

    private void verifyBinomialCalculation(Binomial b, double x) {
        double myY = x*x*b.getA() + x*b.getB() + b.getC();
        assertEquals(myY, b.valueOf(x));
    }
}
