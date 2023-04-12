package java_core_task;//В функции main() проинициализировать двумерный массив размерностью m x n вещественных чисел
//Создать функцию, которая принимает в качестве параметра массив, определяет, сколько раз в этом массиве встречается элемент со значением 0
//и возвращает это количество. Результат вывести на экран.

import java.util.Scanner;

public class task_4_8 {
    public static int zeroCountArr(float[][] arr){
        int count = 0;
        for (float[] arr1 : arr){
            for (float n : arr1){
                if (n == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m:");
        int m = scanner.nextInt();
        System.out.println("Введите n:");
        int n = scanner.nextInt();
        float[][] arr = new float[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Введите arr[" + (i + 1) + "][" + (j + 1) + "]");
                arr[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Количество нулевьіх єлементов:\n" + zeroCountArr(arr));
    }
}
