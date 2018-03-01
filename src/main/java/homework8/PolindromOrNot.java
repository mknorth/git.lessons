package homework8;

import java.util.Scanner;

public class PolindromOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LetsPlay");
        String sc = scanner.nextLine();

        char[] at = sc.toCharArray();

        String stringToDisplay = "";
        for (int i=at.length-1; i>=0; i--){
            stringToDisplay += at[i];
        }

        if (stringToDisplay.compareTo(sc)==0) {
            System.out.println("This is polindrome!!!!");
        }else {
            System.out.println("FUCK YOU!!!! This is not a polindrome!! " + sc);
        }
    }
}
