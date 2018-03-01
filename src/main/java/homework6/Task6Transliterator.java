package homework6;

import java.util.Scanner;

public class Task6Transliterator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи меня: ");
        String sc = scanner.nextLine();

        /*for (int i = 0; i < sc.length(); i++) {
            char[] charArray = sc.toCharArray();
            System.out.println(charArray[i]);
            switch (charArray[i]) {
                case 'A':
                    return 'А';
            }
        }*/

//        String[] first = {"a","b","v","g","d","e","je","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","kh","z","c","ch","sh","jsh","hh","ih","jh","eh","ju","ja"," ",};
        char[] first = {'a','b','v','g','d','e','1','2','z','i','y','k','l','m','n','o','p','r','s','t','u','f','h','z','c','4','5','6','7','8','9','0','-','=',' '};

//        String[] second = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","z","ц","ч","ш","щ","х","ы","ь","э","ю","я"," ",};
        char[] second = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','z','ц','ч','ш','щ','х','ы','ь','э','ю','я',' '};


        char[] cha = sc.toCharArray();
        //char[] cha2 = (char)[] first;

            for (int i=0; i<cha.length; i++){
                //System.out.println(cha[i] + " " + i);
                for (int j=0; j<first.length; j++){
                    if (cha[i] == first[j]){
                        /*if (first[j] == 'j'){
                                if (first[j+1] == 'e'){
                                    System.out.println("ё");
                                }
                        }*/
                        //System.out.println(first[j] + " " + j);
                        for (int g=0; g<second.length; g++){
                            if (g==j){
                                System.out.print(second[g]);
                            }
                        }

                    } /*else {
                        System.out.println("Нет такого символа((((" + cha[i]);
                    }*/
                }
            }
        for (int i=0; i<cha.length; i++){
            //System.out.println(cha[i] + " " + i);
            for (int j=0; j<second.length; j++){
                if (cha[i] == second[j]){
                    //System.out.println(second[j] + " " + j);
                    for (int g=0; g<first.length; g++){
                        if (g==j){
                            System.out.print(first[g]);
                        }
                    }

                } /*else {
                    System.out.println("Нет такого символа((((" + cha[i]);
                }*/
            }
        }







//            for (int j=0; j<first.length; j++){
//            if (cha.equals(first[j])){
//                int k = j;
//                System.out.println("k: " + k);
//            }
//
//        }


            //System.out.print(cha[i] + " ");
            /*for (String s:first){
                if (s.equals(first)){
                    for (int j = 0; j<first.length; j++){

                    }
                }
                int rt = Integer.parseInt(s);
                System.out.print(rt + " ");
            }*/


    }
}
