//В функции main() проинициализировать одномерный массив целых чисел
//Создать функцию, которая принимает в качестве параметра массив,
//находит нулевой элемент массива (элемент с индексом 0), переносит его на последнее место,
//сдвинув влево все стоящие за ним элементы. Вывести полученный массив на экран.

import java.util.Scanner;

public class task_4_6 {
    public static int[] leftShift(int[] arr){
        int zeroElement = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length-1] = zeroElement;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++){
            System.out.println("Введите " + (i + 1) + "-й єлемент");
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = leftShift(arr);
        for (int i : arr2){
            System.out.print(i + " ");
        }


    }
}
