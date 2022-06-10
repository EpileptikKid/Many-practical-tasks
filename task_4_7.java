//В функции main() проинициализировать двумерный массив размерностью m x n вещественных чисел
//Создать функцию, которая принимает в качестве параметра массив, находит максимальный по модулю элемент массива и возвращает найденное значение
//Результат вывести на экран.

import java.util.Scanner;

public class task_4_7 {
    public static float maxElemArr(float[][] arr){
        float max = Math.abs(arr[0][0]);
        for (float[] arr1 : arr){
            for (float n : arr1){
                if (Math.abs(n) > max){
                    max = Math.abs(n);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m:");
        int m = scanner.nextInt();
        System.out.println("Введите n:");
        int n = scanner.nextInt();
        float[][] arr = new float[m][n];
        System.out.println("Массив имеет вид:");

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = (float) (Math.random()*200 - 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Наибольший єлемент по модулю:\n" + maxElemArr(arr));
    }
}
