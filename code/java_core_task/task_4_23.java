package java_core_task;//Реализовать функцию вычисления квадратного корня с параметром типа Double и возвращающую Double
//Алгоритм вычисления квадратного корня заключается в определении начального приближения (например, 1)
//и последовательного получения новых приближений как среднего арифметического предыдущего числа и аргумента, деленного на это приближение
//Алгоритм завершается, когда два последовательных приближения будут отличаться меньше заданной точности
//Функция должна возвращать null, если аргумент – null или отрицательный

import java.util.Scanner;

public class task_4_23 {

    public static double sqrtFunc(double num, double eps){
        double left = 1;
        double right = num;
        double approx = 0;
        double middle = 0;
        while (Math.abs(approx - num) > eps){
            middle = left + (right - left) / 2;
            approx = middle * middle;
            if (approx > num) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return middle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double num = scanner.nextDouble();
        System.out.println("Введите дельту");
        double eps = scanner.nextDouble();
        System.out.println(sqrtFunc(num, eps));

    }
}
