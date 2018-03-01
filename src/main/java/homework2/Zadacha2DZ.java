package homework2;

public class Zadacha2DZ {
    public static void main(String[] args) {
        //условие: посчитать сумму цыфр двузначного числа
        int a = 25;
        int b,c,d;


        b = a % 10;
        c = (a - b)/10;
        d = b + c;
        System.out.println(d);
    }

}
