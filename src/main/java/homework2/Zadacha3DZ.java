package homework2;



public class Zadacha3DZ {
    /*округлить до ближайшего целого числа (но тут можно только float так как round
     работает только с float)*/

    public static void main(String[] args) {
        double a = 2.54;
        int b;

        b = (int) Math.round(a);
        System.out.println(b);
    }
}
