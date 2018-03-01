package lesson4.loops.conditions;

import java.util.Scanner;

public class TascSwitch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,User");
        System.out.println("1 - mondey");
        System.out.println("2 - tusda");
        System.out.println("3 - wedn");
        System.out.println("4 - thur");
        System.out.println("5 - fri");
        System.out.println("6 - sut");
        System.out.println("7 - sun");
        System.out.println("Select number: ");


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such Day");
                break;

        }

    }
}
