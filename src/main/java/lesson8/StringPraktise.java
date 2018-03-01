package lesson8;

public class StringPraktise {
    public static void main(String[] args) {
        int t = 10;
        String r = String.valueOf(t);
        System.out.println(r);

        int y = Integer.parseInt(String.valueOf(t));
        System.out.println(y);

        double d = 2.5;
        String f = String.valueOf(d);
        System.out.println(f);
        double g = Double.parseDouble(String.valueOf(d));
        System.out.println(g);

        long l = 1234567890;
        String st = String.valueOf(l);
        System.out.println(st);

        long p = Long.parseLong(String.valueOf(l));
        System.out.println(p);

        boolean g1 = true;
        String df = String.valueOf(g1);
        System.out.println(df);
        boolean o = Boolean.parseBoolean(String.valueOf(g1));
        System.out.println(o);
    }
}
