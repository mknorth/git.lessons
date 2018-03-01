package lesson6;

import java.util.Arrays;

public class Practik3Example {
    public static void main(String[] args) {

//        int[] a ={1,121,56,45,23};
//        for (int f:a) {
//            if (a[0] > a[1]) {
//                int b = a[1];
//                a[1] = a[0];
//                a[0] = b;
//            }
//            if (a[1] > a[2]) {
//                int b = a[2];
//                a[2] = a[1];
//                a[1] = b;
//            }
//            if (a[2] > a[3]) {
//                int b = a[3];
//                a[3] = a[2];
//                a[2] = b;
//            }
//            if (a[3] > a[4]) {
//                int b = a[4];
//                a[4] = a[3];
//                a[3] = b;
////            }
////        }
//
//for (int f:a) {
//    System.out.println(f);


/*    int[] a ={1,121,56,45,23,500,11,145,122};
        for (int k:a) {
            for (int i = 0; i < a.length - 1; i++) {
                // System.out.println(i);
                if (a[i] > a[i + 1]) {
                    int b = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = b;
                }

            }
        }


for (int f:a){
    System.out.println(f);
}*/

        int[] a ={1,121,56,45,23,500,11,145,122};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));



    }
}
