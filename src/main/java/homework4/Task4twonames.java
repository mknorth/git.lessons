package homework4;

import java.util.Scanner;

public class Task4twonames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is first name:");
        String sc = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is second name:");
        String sc1 = scanner1.nextLine();

        if (sc.equals(sc1)){
            System.out.println("This two mans hav same names!!!");
        }
        System.out.println("First: " + sc + "\nSeccond: " + sc1);
    }
}
