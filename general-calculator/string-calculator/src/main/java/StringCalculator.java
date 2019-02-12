import forInteger.Adder;

public class StringCalculator {
    public static String concat(String a, String b) { return a + b; }
    public static String addIntgerStrings(String n1, String n2) {
        Integer x = Integer.valueOf(n1), y = Integer.valueOf(n2);
        x = Adder.add(x,y);
        return x.toString();
    }
}
