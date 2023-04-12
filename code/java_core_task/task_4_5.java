package java_core_task;//В функции main() проинициализировать одномерный массив целых чисел
//Создать функцию, которая принимает в качестве параметра массив и находит среднее арифметическое всех чётных элементов массива
//стоящих на нечётных местах (с нечетными индексами). Результат вывести на экран.

import java.util.Scanner;

public class task_4_5 {
    public static float doubleTroubleArr(int[] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if ((i%2 == 1) & (arr[i]%2 == 0)) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0) {
            return (float) sum / count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите \"n\" - размер массива");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        System.out.println("Массив:");

        for (int i = 0; i < sizeArr; i++){
            arr[i] = (int) (Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nРезультат:");
        System.out.println(doubleTroubleArr(arr));


    }
}
