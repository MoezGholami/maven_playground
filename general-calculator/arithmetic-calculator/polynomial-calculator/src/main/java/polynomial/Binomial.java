package polynomial;
import forDouble.Adder;
import forDouble.Multiplier;

public class Binomial {
    private double a, b, c;
    public Binomial() {
        this(0,0,0);
    }
    public Binomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double valueOf(double x) {
        double xx, axx, bx, axxpbx, y;

        xx = Multiplier.multiply(x,x);
        axx = Multiplier.multiply(a,xx);
        bx = Multiplier.multiply(b,x);
        axxpbx = Adder.add(axx, bx);
        y = Adder.add(axxpbx, c);

        return y;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
}
