//В функции main() проинициализировать одномерный массив вещественных чисел случайными значениями в диапазоне от -100 до 100.
//Создать функцию, которая принимает в качестве параметра массив, находит количество отрицательных элементов этого массива,
//создает новый массив необходимой размерности, заполняет его отрицательными элементами и возвращает новый массив. Результат вывести на экран

import java.util.Scanner;

public class task_4_3 {
    public static float[] arrSubZero(float[] arr){
        int arrCount = 0;
        for (float i : arr){
            if (i < 0){
                arrCount += 1;
            }
        }
        float[] arrResult = new float[arrCount];
        arrCount = 0;
        for (float i : arr){
            if (i < 0){
                arrResult[arrCount] = i;
                arrCount += 1;
            }
        }
        return arrResult;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввеедите \"n\" - размер масива");
        int sizeArr = scanner.nextInt();
        float[] arr = new float[sizeArr];
        System.out.print("Сгенерированньій масив имеет вид:\n");
        for (int i = 0; i < sizeArr; i++){
            arr[i] =(float) (Math.random()*200 - 100);
            System.out.print(arr[i] + " ");
        }
        float[] arr2 = arrSubZero(arr);
        System.out.print("\nНовьій масив имеет вид:\n");
        for (float i : arr2){
            System.out.print(i + " ");
        }
    }
}
