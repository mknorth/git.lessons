package homework6;

import java.util.Scanner;

public class Taska7KrestNolik {
    public static void main(String[] args) {
        char[][] g = new char[3][3];
        boolean deb = true;

//            for (int i = 0; i < g.length; i++) {
//                for (int j = 0; j < g[i].length; j++) {
//                    g[i][j] = 9;
//                }
//            }

           /* for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < g[i].length; j++) {
                    //System.out.print(g[i][j] + "\t");
                }
                //System.out.println();
            }*/
        while (deb) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x: ");
            int sc = scanner.nextInt();
            System.out.println("Введите y: ");
            int sc2 = scanner.nextInt();
           // g[sc][sc2] = 1;




            while (g[sc][sc2] == '1' || g[sc][sc2] == '2'  || sc < 0 || sc > 2
                            || sc2 < 0 || sc2 > 2) {
                        System.out.println("Введите x: ");
                        sc = scanner.nextInt();
                        System.out.println("Введите y: ");
                        sc2 = scanner.nextInt();
                    }
                    g[sc][sc2] = '1';
            //System.out.println("X: " + 'X');

            int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
            while (g[x][y] == '1' || g[x][y] == '2') {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
            }
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            g[x][y] = '2';

            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < g[i].length; j++) {


                    System.out.print(g[i][j] + "\t");
                }
                System.out.println();
            }

            /*for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < g[i].length; j++) {*/

                    if (g[0][0] == 1 && g[1][1] == 1 && g[2][2] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[0][0] == 1 && g[0][1] == 1 && g[0][2] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[0][0] == 1 && g[1][0] == 1 && g[2][0] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[1][0] == 1 && g[1][1] == 1 && g[1][2] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[2][0] == 1 && g[2][1] == 1 && g[2][2] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[0][1] == 1 && g[1][1] == 1 && g[2][1] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    } else if (g[0][2] == 1 && g[1][2] == 1 && g[2][2] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;

                    }else if (g[0][2] == 1 && g[1][1] == 1 && g[2][0] == 1) {
                        System.out.println("You Are Win!!!");
                        deb = false;
                }
                if (deb == false) {
                    System.out.println("Game Over");
                    break;
                }
            //}
        }
    }
}
