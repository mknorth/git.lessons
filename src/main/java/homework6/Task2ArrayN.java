package homework6;

public class Task2ArrayN {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5, 12, 1, 3, 12, 1};
        int max = a[0];
        int min = a[0];
        int s = 0;
        int d = 0;
        for (int i = 0; i<a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
            //так не работает потому что мы в массиве все это делаем!!! А нужно за массивом
//            if (min == a[i]){
//                s++;
//            }
//            if (max == a[i]) {
//                d++;
//            }
//            System.out.println(a[i]);
        }
        for (int i = 0; i<a.length; i++){
            if (min == a[i]){
                s++;
            }
            if (max == a[i]) {
                d++;
            }
        }
        System.out.println("MinValue: " + min + "\nMaxValur: " + max + "\nRepitTimeMinV: " + s + "\nRepitTimeMaxV: " + d);


    }
}
