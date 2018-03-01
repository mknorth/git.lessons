package homework6;

import java.util.Arrays;

public class Task1Tenodds {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0;i<a.length;i++){
            a[i] = 2*i+1;
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
