package java_core_task;//В функции main() проинициализировать одномерный массив целых чисел. Создать функцию, которая осуществляет упорядочение массива методом сортировки вставками
//Алгоритм заключается в следующем:
//перебираем все элементы массива по очереди;
//выбираем очередной элемент массива, сдвигаем, если нужно, элемент влево, пока он не окажется на нужной позиции
//(при этом элементы, стоящие между первоначальной и окончательной позициями данного элемента, сдвигаются вправо);
//продолжаем до тех пор, пока не переберем все элементы массива.
//Результат вывести на экран.

import java.util.Scanner;

public class task_4_12 {
    public static int[] arrSort(int[] arr, int sizeArr){
        for (int i = 1; i < sizeArr; i++){
            int currentVar = arr[i];
            int j = i-1;
            for (; j >= 0; j--){
                if (currentVar < arr[j]){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = currentVar;
        }
        return arr;
    }

    public static int[] arrSort(int[] arr){
        return arrSort(arr, arr.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n - размер массива");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++){
            arr[i] = (int) (Math.random()*200 - 100);
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("\nОтсортированньій массив:");
        int[] arrSort = arrSort(arr);
        for (int i : arrSort){
            System.out.print(i + " ");
        }

    }
}
