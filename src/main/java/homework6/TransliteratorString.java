package homework6;

import java.util.Scanner;

public class TransliteratorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи меня: ");
        String sc = scanner.nextLine();


        String[] first = {"a","b","v","g","d","e","je","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","kh","z","c","ch","sh","jsh","hh","ih","jh","eh","ju","ja"," ",};
//        char[] first = {'a','b','v','g','d','e','1','2','z','i','y','k','l','m','n','o','p','r','s','t','u','f','h','z','c','4','5','6','7','8','9','0','-','=',' '};

        String[] second = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","z","ц","ч","ш","щ","х","ы","ь","э","ю","я"," ",};
//        char[] second = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','z','ц','ч','ш','щ','х','ы','ь','э','ю','я',' '};
        for (String g:second){
            System.out.println(g);
        }
        /*for (int i=0; i<sc.length(); i++){
            //System.out.println(cha[i] + " " + i);
            for (int j=0; j<first.length; j++){
                if (sc.equals(first[j])){
                    //System.out.println(first[j] + " " + j);
                    for (int g=0; g<second.length; g++){
                        if (g==j){
                            System.out.print(second[g]);
                        }
                    }

                }
            }
        }
        for (int i=0; i<sc.length(); i++){
            //System.out.println(cha[i] + " " + i);
            for (int j=0; j<second.length; j++){
                if (sc.equals(second[j])){
                    //System.out.println(second[j] + " " + j);
                    for (int g=0; g<first.length; g++){
                        if (g==j){
                            System.out.print(first[g]);
                        }
                    }

                }
            }
        }
*/



    }
}
