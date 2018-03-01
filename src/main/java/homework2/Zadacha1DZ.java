package homework2;

import java.text.CharacterIterator;
import java.util.Scanner;

public class Zadacha1DZ {
    public static void main(String[] args) {
        // нужно было поделить 2 числа и узнать остаток и норм число что делится без остатка
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String sic = sc.next();
        System.out.println("Введите второе число: ");
        String sid = sd.next();
//        int a = 21;
//        int b = 8;
        int d;
        int k;
        int z;
        int a = Integer.parseInt(sic);
        int b = Integer.parseInt(sid);


        d = a % b;
        k = a - d;
        z = k / b;

        System.out.println("И так " + a + " / " + b + " = " + z + " (и остаток " + d + ")");


    }
}
