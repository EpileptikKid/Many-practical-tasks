//Проинициализировать одномерный массив целых чисел случайными значениями
//Осуществить упорядочение массива методом сортировки выбором. Алгоритм заключается в следующем:
//находим номер минимального значения в текущем списке;
//производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции);
//сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы.
//Результат вывести на экран.

import java.util.Scanner;

public class task_4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++){
            arr[i] = (int) (Math.random()*200-100);
        }

        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println("Отсортированньій массив:");

        for (int i = 0; i < sizeArr-1; i++){
            int min_index = i;
            for (int j = i+1; j < sizeArr; j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if (min_index != i) {
                int extraVar = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = extraVar;
            }
        }

        for (int n : arr){
            System.out.print(n + " ");
        }
    }
}
