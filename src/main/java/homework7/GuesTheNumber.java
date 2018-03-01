package homework7;

import org.apache.xpath.SourceTree;

import java.util.Scanner;

public class GuesTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок Выбирает число от 0 до 100: ");
        int sc = scanner.nextInt();

        if (sc>0 && sc<101){
            int a = 0;
            int b = 100;
            int rand1 =  a + (int)(Math.random()*b);
            System.out.println("Computer Chose: " + rand1);
            int rand2 =  a + (int)(Math.random()*b);
            System.out.println("Opponent Chose: " + rand2);
            int z = sc - rand1;
            int h = rand2 - rand1;
            if (Math.abs(z) > Math.abs(h)){
                System.out.println("Победил Оппонент! " +  "Оппонент: " + rand2 + " Компьютер: " + rand1 + " Игрок: " + sc);
            }else if (Math.abs(z) < Math.abs(h)){
                System.out.println("Победил Игрок! " +  "Оппонент: " + rand2 + " Компьютер: " + rand1 + " Игрок: " + sc);
            }else {
                System.out.println("Победила дружба!!! " + "Оппонент: " + rand2 + " омпьютер: " + rand1 + " Игрок: " + sc);
            }
        }else {
            System.out.println("No no no only from 0 to 100!!!");
        }




    }
}
