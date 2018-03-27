package homework10;

import java.util.Scanner;

public class CalExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer sc = scanner.nextInt();
        String sc1 = scanner.next();
        Integer sc2 = scanner.nextInt();

        System.out.print(sc + " " + sc1 + " " + sc2 + " = ");

        if (sc1.equals("+")){
            System.out.println(sc+sc2);
        } else if (sc1.equals("-")){
            System.out.println(sc-sc2);
        }else if (sc1.equals("*")){
            System.out.println(sc*sc2);
        }else if (sc1.equals("/")){
            System.out.println(sc/sc2);
        }

    }
}
