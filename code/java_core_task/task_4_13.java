package java_core_task;//Реализовать функцию вычисления чисел Фибоначчи (до 92-го числа включительно) с использованием вспомогательного массива (статического поля)
//Параметр функции – номер числа Фибоначчи. При первом вызове функции массив заполняется до необходимого числа
//При последующих вызовах число либо возвращается из массива, либо вычисляется с использованием последних двух чисел,
//хранящихся в массиве с дальнейшим заполнением массива. Использовать тип long для представления чисел.
//Осуществить тестирование функции для различных значений номеров, вводимых в произвольном порядке.

import java.util.Scanner;

public class task_4_13 {
    private static long[] arrFib = new long[92];
    private static int last = 0;

    public static long fibonachi(int n){
        arrFib[0] = 1;
        arrFib[1] = 1;
        last = 2;
        if (n > last) {
            for (int i = last; i <= n; i++){
                arrFib[i] = arrFib[i-1] + arrFib[i-2];
            }
            last = n;
        }
        return arrFib[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа фибоначи");
        int numFib = scanner.nextInt();
        System.out.println(fibonachi(numFib));
        for (int i = 1; i <= 5; i++){
            int j = (int) (Math.random()*92);
            System.out.println((j + 1) + " " + fibonachi(j));
        }

    }
}
