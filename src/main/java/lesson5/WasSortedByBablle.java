package lesson5;

import java.util.Arrays;

public class WasSortedByBablle {
    public static void main(String[] args) {
        int[] argo = {1,3,4,675,868,9,-1};
        boolean trast = true;
//    for (int ad:argo) {
//        for (int i = 0; i < argo.length - 1; i++) {
//            if (argo[i] > argo[i + 1]) {
//                int temp = argo[i + 1];
//                argo[i + 1] = argo[i];
//                argo[i] = temp;
//            }
//
//        }
//
//    }
//    for (int ad:argo){
//        System.out.println(ad);
//    }
// // та же программа но только с использолваннием while что на самом деле делает программу более логичной!!!!
    while (trast){
        trast = false;
        for (int i = 0; i<argo.length-1; i++){
            if (argo[i] > argo[i+1]){
                int ter = argo[i+1];
                argo[i+1] = argo[i];
                argo[i] = ter;
                trast = true;
            }
        }
    }
    for (int supper:argo){
        System.out.println(supper);
    }

        /*char[] charArray = new char[255];

        for (int i=0; i<charArray.length; i++){
            charArray[i] = (char) i;
        }

        System.out.println("Char array: " + Arrays.toString(charArray));*/


    }
}
