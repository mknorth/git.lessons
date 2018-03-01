package MTests;

public class TryCycleForBreake {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,678,678,768,76,87,6,9,898};
        int sum = 0;
        for (int r:i){
            System.out.println(r);
            sum += r;
            if (r == 6){break;}
        }
        System.out.println(sum);
    }
}
