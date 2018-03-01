package homework4;

import java.util.Scanner;

public class Task1minfrom4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
//        System.out.println("Первое число:");
//        String sc = scanner.nextLine();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Второе число:");
//        String sc2 = scanner2.nextLine();
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Третье число:");
//        String sc3 = scanner3.nextLine();
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Четвертое число:");
//        String sc4 = scanner4.nextLine();
//
//        int sc1 = Integer.parseInt(sc);
//        int sc21 = Integer.parseInt(sc2);
//        int sc31 = Integer.parseInt(sc3);
//        int sc41 = Integer.parseInt(sc4);
//
//        int x,y,z;
//        int x1,y1,z1;
//
//        if (sc1 < sc21) {
//            x = sc1;
//        }else{x = sc21;}
//        if (sc31 < sc41){
//            y = sc31;
//        }else{y = sc41;}
//        if (x < y){
//            z = x;
//        }else {
//            z = y;
//        }
//

//        if (sc1 > sc21) {
//            x1 = sc1;
//        }else{x1 = sc21;}
//        if (sc31 > sc41){
//            y1 = sc31;
//        }else{y1 = sc41;}
//        if (x1 > y1){
//            z1 = x1;
//        }else {
//            z1 = y1;
//        }
//
//        int n = 1;
//        if (x1 == y1) {
//            n++;
//
//            if (sc1 == sc1) {
//                n++;
//            }
//
//            if (sc31 == sc41) {
//                n++;
//            }
//        }
//        if ()




        int n1 = 0;

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            int answer = Math.min( Math.min(a,b), Math.min(c,d) );
            System.out.println(answer);



        int answer1 = Math.max( Math.max(a,b), Math.max(c,d));
        System.out.println(answer1);

        if (answer1 == a){
            n1++;
        }
        if (answer1 == b){
            n1++;
        }
        if (answer1 == c){
            n1++;
        }
        if (answer1 == d){
            n1++;
        }
        System.out.println("n1 = " + n1);








//        System.out.println("Наименьшее число из 4-рех: " + z1 + ";" + " Таких чисел(n): " + n + ";");

    }
}
