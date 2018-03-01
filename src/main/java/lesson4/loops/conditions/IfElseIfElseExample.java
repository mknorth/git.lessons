package lesson4.loops.conditions;

import java.util.Scanner;

public class IfElseIfElseExample {
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

        if (choice == 1){
            System.out.println("Jack Danielse");
        } else if (choice == 2){
            System.out.println("Justin Bieber Despasito");
        } else if (choice == 3){
            System.out.println("Hulk is here");
        }else if (choice == 4){
            System.out.println("Obama is here");
        }else if (choice == 5){
            System.out.println("Die MTFK");
        }else {
            System.out.println("No such nomber");
        }



        System.out.println(choice);
    }
}
