package homework2;

public class IntCharFloatCharFloatCharInt {
    public static void main(String[] args) {
        char xChar;
        Integer x2 = new Integer(75);
        xChar = (char) x2.intValue();
        System.out.println("Char-x2: " + xChar);

        char xCharx;
        Float x4 = new Float(1.2f);
        xCharx = (char) x4.floatValue();
        System.out.println("Float-x4: " + xCharx);

        int intFCI;
        char charF;
        Float fl = new Float(1.0f);
        System.out.println("Float-fl: " + fl);
        charF = (char) fl.floatValue();
        System.out.println("Char-charF: "+ charF);
        Character chard = new Character(charF);
        intFCI = chard.charValue();
        System.out.println("Int-intFCI: " + intFCI);
    }
}
