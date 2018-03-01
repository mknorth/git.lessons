package lesson2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

public class WrapperClassExample {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Character c = new Character('c');
        Boolean b = new Boolean(true);


        int xInt;
        Float x = new Float("3.86f");
        xInt = x.intValue();
        System.out.println("int-x: " + xInt);
        float xFlout;
        Integer x1 = new Integer(123);
        xFlout = x1.floatValue();
        System.out.println("float-x1: " + xFlout);
        char xChar;
        Integer x2 = new Integer(75);
        xChar = (char) x2.intValue();
        System.out.println("Char-x2: " + xChar);
        int xInt2;
        Character x3 = new Character('K');
        xInt2 = x3.charValue();
        System.out.println("Int-x3: " + xInt2);


        int ch = 75;
        char intCh = (char) ch;
        System.out.println("intvChar: " + intCh);

        char ch1 = 'K';
        int intCh1 = ch1;
        System.out.println("charvInt: " + intCh1);

        char charEx;
        Float f = new Float(3.5f);
        charEx = (char) f.floatValue();
        System.out.println("charEx: " + charEx);

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
