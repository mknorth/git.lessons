package MTests;

import java.util.Scanner;

public class Practiks2 {

        public static void main(String[] args) {
            char[][] g = new char[3][3];
            boolean deb = true;

            while (deb) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите x: ");
                int x = scanner.nextInt();
                System.out.println("Введите y: ");
                int y = scanner.nextInt();

                if (g[x][y] == '1' || g[x][y] == '2' || x<0 || x>2 || y<0 ||y>2){
                    System.out.println("Введите x: ");
                    x = scanner.nextInt();
                    System.out.println("Введите y: ");
                    y = scanner.nextInt();
                }
                g[x][y] = '1';

                if (g[0][0] == '1' && g[1][1] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][0] == '1' && g[0][1] == '1' && g[0][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][0] == '1' && g[1][0] == '1' && g[2][0] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[1][0] == '1' && g[1][1] == '1' && g[1][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[2][0] == '1' && g[2][1] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][1] == '1' && g[1][1] == '1' && g[2][1] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][2] == '1' && g[1][2] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                }else if (g[0][2] == '1' && g[1][1] == '1' && g[2][0] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;
                }
                if (deb == false) {
                    System.out.println("Game Over");
                    break;
                }

                int f1 = 0;
                if (x==1 && y==1 && g[x][y] !='1' && g[x][y]!='2' && g[1][1]!='1'){
                    g[0][0]='2';
                    f1++;
                }
                else if (f1==1){
                    if (x==0 && y==0 || x==0 && y==2 || x==2 && y==0 || x==2 && y==2 && g[x][y] !='1' && g[1][1]!='1') {
                        g[1][1] = '2';
                        System.out.println("я поставил 2");
                    }
                }

                //условия на 2 одинаковых клетки от юзера
                if (g[0][0]=='1' && g[0][1]=='1' && g[0][2]!='2' && g[0][2]!='1'){
                    g[0][2]='2';
                }else if (g[0][1]=='1' && g[0][2]=='1' && g[0][0]!='2' && g[0][0]!='1'){
                    g[0][0]='2';
                }else if (g[0][0]=='1' && g[0][2]=='1' && g[0][1]!='2' && g[0][1]!='1'){
                    g[0][1]='2';
                }else if (g[1][0]=='1' && g[1][1]=='1' && g[1][2]!='2' && g[1][2]!='1'){
                    g[1][2]='2';
                }else if (g[1][1]=='1' && g[1][2]=='1' && g[1][0]!='2' && g[1][0]!='1'){
                    g[1][0]='2';
                }else if (g[1][0]=='1' && g[1][2]=='1' && g[1][1]!='2' && g[1][1]!='1'){
                    g[1][1]='2';
                }else if (g[2][0]=='1' && g[2][1]=='1' && g[2][2]!='2' && g[2][2]!='1'){
                    g[2][2]='2';
                }else if (g[2][1]=='1' && g[2][2]=='1' && g[2][0]!='2' && g[2][0]!='1'){
                    g[2][0]='2';
                }else if (g[2][0]=='1' && g[2][2]=='1' && g[2][1]!='2' && g[2][1]!='1'){
                    g[2][1]='2';
                }else if (g[0][0]=='1' && g[1][0]=='1' && g[2][0]!='2' && g[2][0]!='1'){
                    g[2][0]='2';
                }else if (g[1][0]=='1' && g[2][0]=='1' && g[0][0]!='2' && g[0][0]!='1'){
                    g[0][0]='2';
                }else if (g[0][0]=='1' && g[2][0]=='1' && g[1][0]!='2' && g[1][0]!='1'){
                    g[1][0]='2';
                }else if (g[0][1]=='1' && g[1][1]=='1' && g[2][1]!='2' && g[2][1]!='1'){
                    g[2][1]='2';
                }else if (g[1][1]=='1' && g[2][1]=='1' && g[0][1]!='2' && g[0][1]!='1'){
                    g[0][1]='2';
                }else if (g[0][2]=='1' && g[1][2]=='1' && g[2][2]!='2' && g[2][2]!='1'){
                    g[2][2]='2';
                }else if (g[1][2]=='1' && g[2][2]=='1' && g[0][2]!='2' && g[0][2]!='1'){
                    g[0][2]='2';
                }else if (g[0][2]=='1' && g[2][2]=='1' && g[1][2]!='2' && g[1][2]!='1'){
                    g[1][2]='2';
                }else if (g[0][0]=='1' && g[1][1]=='1' && g[2][2]!='2' && g[2][2]!='1'){
                    g[2][2]='2';
                }else if (g[1][1]=='1' && g[2][2]=='1' && g[1][1]!='2' && g[1][1]!='1'){
                    g[1][1]='2';
                }else if (g[0][0]=='1' && g[2][2]=='1' && g[1][1]!='2' && g[1][1]!='1'){
                    g[1][1]='2';
                }else if (g[0][2]=='1' && g[1][1]=='1' && g[2][0]!='2' && g[2][0]!='1'){
                    g[2][0]='2';
                }else if (g[1][1]=='1' && g[2][0]=='1' && g[0][2]!='2' && g[0][2]!='1'){
                    g[0][2]='2';
                }else if (g[0][2]=='1' && g[2][0]=='1' && g[1][1]!='2' && g[1][1]!='1'){
                    g[1][1]='2';
                }else {
                    int z = (int) (Math.random() * 3), a = (int) (Math.random() * 3);
                        if (g[z][a] == '1' || g[z][a] == '2') {
                            z = (int) (Math.random() * 3);
                            a = (int) (Math.random() * 3);
                        }
                    g[z][a] = '2';
                }


//                int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
                /*while (g[x][y] == '1' || g[x][y] == '2') {
                    x = (int) (Math.random() * 3);
                    y = (int) (Math.random() * 3);
                    g[x][y] = '2';
                }
                System.out.println("z: " + x);
                System.out.println("s: " + y);
                g[x][y] = '2';*/



                for (int i = 0; i < g.length; i++) {
                    for (int j = 0; j < g[i].length; j++) {


                        System.out.print(g[i][j] + "\t");
                    }
                    System.out.println();
                }


                /*if (g[0][0] == '1' && g[1][1] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][0] == '1' && g[0][1] == '1' && g[0][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][0] == '1' && g[1][0] == '1' && g[2][0] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[1][0] == '1' && g[1][1] == '1' && g[1][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[2][0] == '1' && g[2][1] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][1] == '1' && g[1][1] == '1' && g[2][1] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                } else if (g[0][2] == '1' && g[1][2] == '1' && g[2][2] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;

                }else if (g[0][2] == '1' && g[1][1] == '1' && g[2][0] == '1') {
                    System.out.println("You Are Win!!!");
                    deb = false;
                }
                if (deb == false) {
                    System.out.println("Game Over");
                    break;
                }*/
        }
    }

}
