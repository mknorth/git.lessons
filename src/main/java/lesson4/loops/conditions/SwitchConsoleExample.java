package lesson4.loops.conditions;

import java.util.Scanner;

public class SwitchConsoleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,User");
        System.out.println("a - print Jack");
        System.out.println("a - print Biber");
        System.out.println("a - print Hulk");
        System.out.println("a - print Obama");
        System.out.println("a - print Ptn");
        System.out.println("Select number: ");


        int choice = scanner.nextInt();

        switch (choice){
            case 1 : System.out.println("Jack Danielse");
                break;
            case 2 : System.out.println("Justin Bieber Despasito");
                break;
            case 3 : System.out.println("Hulk is here");
                break;
            case 4 : System.out.println("Obama is here");
                break;
            case 5 : System.out.println("Die MTFK");
                break;
            default:System.out.println("No such nomber");
                break;

        }


    }
}
