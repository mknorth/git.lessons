package homework2;

public class Zadacha4DZ {
    public static void main(String[] args) {
        //условие: посчитать сумму цыфр трехзначного числа

        int a = 124;
        int b,c,d,e,g;


        b = a % 100;
        e = (a-b)/100;
        c = b % 10;
        d = (b - c)/10;
        g = e + d + c;

        System.out.println(g);
    }
}
