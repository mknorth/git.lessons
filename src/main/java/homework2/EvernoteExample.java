package homework2;

public class EvernoteExample {
    public static void main(String[] args) {
        int cg = 75;
        char gc = (char) cg;
        System.out.println("INTvCHAR: 75 = " + gc);

        char xChar;
        Integer i = new Integer(75);
        xChar = (char) i.intValue();
        System.out.println(xChar);

        float ft = 34.4f;
        char cf = (char) ft;
        System.out.println(cf);

        char fChar;
        Float flt = new Float(34.4f);
        fChar = (char) flt.floatValue();
        System.out.println("FLOATvCHAR: 34.4f = " + fChar);


        char cChar;
        int xInt;
        Float flk = new Float(34.4f);
       // float flk = 34.4f;
        cChar = (char) flk.floatValue();
        //cChar  = (char) flk;
        xInt = (int) cChar;
        System.out.println("xInt = " + xInt);
        System.out.println("cChar = " + cChar);



        String ftr = new String("34");
        float srf = Float.parseFloat(ftr);
        System.out.println("srf: " + srf);

    }
}
