package lesson5;

public class MAsiveIntExample {
    public static void main(String[] args) {
        int[] art = {1,2,3,4,5,678};
        int[] sampleArray = {1,2,3,4,5,678};
//       это тип 'for each'
//      for (int arter:art) {
//            System.out.println(arter);
//        }
        // а это простой тип 'for'
        for (int i=0; i<sampleArray.length; i++){
            System.out.print(sampleArray[i] + " ");
        }
    }
}
