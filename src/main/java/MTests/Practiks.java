package MTests;

import java.util.Scanner;

public class Practiks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи меня: ");
        String sc = scanner.nextLine();


        String[] first = {"a","b","v","g","d","e","je","zh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","kh","z","c","ch","sh","jsh","hh","ih","jh","eh","ju","ja"," ",};
        char[] first2 = {'a','b','v','g','d','e','1','2','z','i','y','k','l','m','n','o','p','r','s','t','u','f','h','z','c','4','5','6','7','8','9','0','-','=',' '};

        //String[] second = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","z","ц","ч","ш","щ","х","ы","ь","э","ю","я"," ",};
        char[] second = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','z','ц','ч','ш','щ','х','ы','ь','э','ю','я',' '};


        char[] cha = sc.toCharArray();
        //char[] cha2 = (char)[] first;

        /*for (int i=0; i<cha.length; i++){
            //System.out.println(cha[i] + " " + i);
            for (int j=0; j<first.length; j++){
                if (cha[i] == first[j]){
                    if (j==7){

                    }*/

                        /*if (first[j] == 'j'){
                                if (first[j+1] == 'e'){
                                    System.out.println("ё");
                                } else if (first[j+1] == 'h'){
                                    System.out.println("ь");
                                }else if (first[j+1] == 's'){
                                    System.out.println("щ");
                                }
                                i++;
                        }else if (first[j] == 'z'){
                            if (cha[i+1]== first[23]) {
                                System.out.println("ж");
                            }
                            i++;
                        }else if (first[j] == 'k'){
                            if (first[j+1]=='h') {
                                System.out.println("х");
                            }
                            i++;
                        }else if (first[j] == 'c'){
                            if (first[j+1]=='h') {
                                System.out.println("ч");
                            }
                            i++;
                        }*/

                    //System.out.println(first[j] + " " + j);
                   /* for (int g=0; g<second.length; g++){
                        if (g==j){
                            System.out.print(second[g]);
                        }
                    }*/

            /*    } *//*else {
                        System.out.println("Нет такого символа((((" + cha[i]);
                    }*//*
            }
        }*/
//кирилица
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
//латиница
        for (int i=0; i<cha.length; i++){
            //System.out.println(cha[i] + " " + i);
            for (int j=0; j<first.length; j++){
                if (cha[i] == 'j') {
                    ++i;
                    switch (cha[i]){
                        case 'e': System.out.print("ё");
                        break;
                        case 'h': System.out.print("ь");
                        break;
                        case 'u': System.out.print("ю");
                            break;
                        case 's': System.out.print("щ");
                        i++;
                        if (cha[i]!= 'h'){
                            System.out.println("Illegal transliterated symbol at position "+i);
                        }
                        break;
                        default: break;
                    }
                    /*if (cha[j + 1] == 'e') {
                        System.out.print("ё");
                    } else if (cha[j + 1] == 'h') {
                        System.out.print("ь");
                    } else if (cha[j + 1] == 's') {
                        System.out.print("щ");
                    }*/
//                    break;
                }else if(i+1 < cha.length && cha[i+1]=='h' && !(i+2 < cha.length && cha[i+2]=='h')){// Постфиксная нотация, требует информации о двух следующих символах. Для потока придется сделать обертку с очередью из трех символов.
                            switch (cha[i]){
                        case 'z':
                            System.out.print('ж'); break;
                        case 'k':
                            System.out.print('х'); break;
                        case 'c':
                            System.out.print('ч'); break;
                        case 's':
                            System.out.print('ш'); break;
                        case 'e':
                            System.out.print('э'); break;
                        case 'h':
                            System.out.print('ъ'); break;
                        case 'i':
                            System.out.print('ы'); break;
                        default: throw new IllegalArgumentException("Illegal transliterated symbol at position "+i);
                    }
                    i++; // пропускаем постфикс
                }
               if (cha[i] == first2[j]){
                    /*if (cha[i] == 'z') {
                        ++i;
                        switch (cha[i]){
                            case 'h': System.out.print("ж");
                                break;
                            default: System.out.print(cha[i]);
                        }
                        break;
                    }*/
                        //System.out.println(first[j] + " " + j);
                    for (int g=0; g<second.length; g++){
                        if (g==j){
                            System.out.print(second[g]);
                        }
                    }

                }/*else if (cha[i] == 'j'){
                                if (cha[i+1] == 'e'){
                                    System.out.println("ё");
                                }
                                i=i+1;
                                break;
                        }*/

                        /*else {
                        System.out.println("Нет такого символа((((" + cha[i]);
                    }*/
            }
        }


    }

}
