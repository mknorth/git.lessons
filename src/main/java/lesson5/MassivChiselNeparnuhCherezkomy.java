package lesson5;

import org.apache.xpath.SourceTree;

import java.util.Arrays;

public class MassivChiselNeparnuhCherezkomy {

    public static void main(String[] args) {
        int[] arr = {1,3,44,5,6,77,89};
        int max = arr[0];
        int min = arr[0];
        int t;
        int nMax = 0;
        int nMin = 0;
        int sum = 0;
        int sredArif;

        for (int i = 0; i < arr.length; i++){

            if (max<arr[i]){
                max = arr[i];
                nMax = i;
            }
            if (min > arr[i]){
                min = arr[i];
                nMin = i;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("Меняем местами макс и мин:");
        //меняем местами самое большое и самое маленькое число в массиве
        t = arr[nMin];
        arr[nMin] = arr[nMax];
        arr[nMax] = t;
        for (int at:arr){
            System.out.print(at + " ");
            sum += at;
        }
        System.out.println();

        //считаем среднее арифметическое массива
        sredArif = sum/arr.length;
        System.out.println("Среднее арифметическиое: " + sredArif);

        //вывести нечетные значения через кому
        System.out.println("Нечетные значения через кому");
        for (int i = 0; i <arr.length; i++){
            if (arr[i]%2 != 0){
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Нечетные значения через кому (в виде массива)");
        //вывести нечетные значения через кому (в виде массива!!!)
        int[] arra = new int[10];
        for(int i = 0; i < 10; i++)
            arra[i] = 2*i+1;
        System.out.print(Arrays.toString(arra));
    }
}
