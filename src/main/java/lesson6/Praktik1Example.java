package lesson6;

public class Praktik1Example {
    public static void main(String[] args) {
        int[] ar = {2,3,-1,6,6,6,7,8,9,0,1111};
        int max = ar[0];
        int min = ar[0];
        for(int arrElement:ar){
            if (max < arrElement){
                max = arrElement;
            }else if (min > arrElement) {
                min = arrElement;
                //System.out.println(arrElement);
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
