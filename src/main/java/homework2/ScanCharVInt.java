package homework2;

import java.util.Scanner;

public class ScanCharVInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character symbol: ");
        String s = sc.next();
        //int d = sc.nextInt();
        //System.out.println("d: " + d);
        char[] charArray = s.toCharArray();
        System.out.println(charArray[0]);
//        int k = (int) charArray[0];
//        System.out.println("k: " + k);

        if (s.length() == 1) {
            char z = s.charAt(0);
            System.out.println("CharSymbol: " + z);
//            int d = (int) z;
            System.out.println("Integer: " + (int)z);
        } else {
            System.out.println(s);
        }
    }
}
