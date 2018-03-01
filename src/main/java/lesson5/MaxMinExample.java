package lesson5;

public class MaxMinExample {
    public static void main(String[] args) {
        int ar[] = {2,3,-1,6,6,6,7,8,9,0,1111};
        int min = ar[0];
        int max = ar[0];
            for (int arr:ar){
                if (min > arr){
                    min = arr;
                }
                if (max < arr){
                    max = arr;
                }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
