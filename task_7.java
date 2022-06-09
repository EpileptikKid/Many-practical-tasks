//Реализовать программу поиска простых чисел. Проверку, является ли число простым, осуществлять в отдельной функции
//которая принимает целое число и возвращает результат типа boolean.
//В функции main() осуществить ввод необходимого диапазона и вывод всех простых чисел в этом диапазоне.

import java.util.Scanner;

public class task_7 {
    public static boolean chekSimleNumber(int n){
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона");
        int min = scanner.nextInt();
        System.out.println("Введите конец диапазона");
        int max = scanner.nextInt();
        System.out.println("Список простьіх чисел до n:");
        for (int i = min; i <= max; i++) {
            if (chekSimleNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}
