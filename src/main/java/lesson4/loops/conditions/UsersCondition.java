package lesson4.loops.conditions;

import java.util.Scanner;

public class UsersCondition {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,User1: ");
        int choice1 = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Hi,User2: ");
        int choice2 = scanner2.nextInt();


        if (choice1 < choice2) {
            System.out.println("User2 is winner!");
        } else if (choice1 == choice2) {
            System.out.println("User1 = User2");
        } else {
            System.out.println("User1 is winner!");


//            int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tusday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("No such Day");
//                break;

        }
    }
}
