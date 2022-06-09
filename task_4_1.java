//Проинициализировать одномерный массив вещественных чисел списком начальных значений.
//Найти сумму положительных элементов. Реализовать два варианта – с циклом и с рекурсией.

import java.util.Scanner;

public class task_4_1 {

    public static float sumMass(float[] arr){
        float sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }


    public static float sumMassRec(float[] arr, int n){
        if (n <= 0){
            return 0;
        }
        n--;
        if (arr[n] > 0){
            return arr[n] + sumMassRec(arr, n);
        } else {
            return sumMassRec(arr, n);
        }
    }

    public static float sumMassRec(float[] arr){
        return sumMassRec(arr, arr.length);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();

        float[] mass = new float[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите " + (i + 1) + "-й єдемент");
            mass[i] = scanner.nextFloat();
        }
        System.out.println(sumMassRec(mass));
    }
}
