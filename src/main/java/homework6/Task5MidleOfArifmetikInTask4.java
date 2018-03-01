package homework6;

public class Task5MidleOfArifmetikInTask4 {
    public static void main(String[] args) {
        int[] arr = {0,-2,3,4,235,35,36,36,23,3};
        int temp,j;

        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
                //System.out.println("arr[j]: " + arr[j] + " " + "j: " + j);
            }
//            for(int fr:arr){
//                System.out.println("fr: " + fr);
//            }
        }
 for(int sr:arr){
            System.out.println("sr: " + sr);
        }
    }

}
