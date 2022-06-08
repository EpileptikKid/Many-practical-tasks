//Реализовать функцию, которая вычисляет наибольший общий делитель двух чисел через использование рекурсии

import java.util.Scanner;

public class task_6 {

    public static int commonDivisor(int x, int y){
        if (x == y){
            return (x);
        } else {
            if (x > y) {
                x-= y;
            } else {
                y -= x;
            }
            return (commonDivisor(x, y));
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println(commonDivisor(a, b));
    }
}
