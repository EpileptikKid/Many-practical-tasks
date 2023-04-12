package java_core_task;//В функции main() проинициализировать одномерный массив целых чисел случайными значениями.
//Создать функцию, которая принимает в качестве параметра массив и выводит на экран сумму элементов массива от первого элемента до элемента с номером k,
//а также сумму элементов от элемента с номером k+1 до последнего.
//Функция возвращает true, если первая сумма больше, и false в противном случае. Результат вывести на экран.

import java.util.Scanner;

public class task_4_2 {

    public static boolean cutSizeArr(int[] arr, int k){
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < k; i++){
            sum1 += arr[i];
        }
        System.out.println(sum1);
        for (int i = k; i < arr.length; i++){
            sum2 += arr[i];
        }
        System.out.println(sum2);
        return sum1 > sum2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < lengthArr; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nВведите значение k");
        int k = scanner.nextInt();
        System.out.println(cutSizeArr(arr, k));
    }
}
