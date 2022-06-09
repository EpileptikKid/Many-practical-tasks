//Реализовать программу поиска чисел Фибоначчи:
//Поиск n-го числа Фибоначчи осуществлять в отдельной функции.
//В функции main() осуществить ввод номера числа и вывод всех чисел Фибоначчи до введенного номера включительно.
//Реализовать два варианта - с использованием цикла и с использованием рекурсии.

import java.util.Scanner;

public class task_8 {
    public static int numberFib(int n){  //метод с использованием цьікла
        int x1 = 1;
        int x2 = 1;
        int x3 = 0;
        for (int i = 3; i <= n; i++){
            x3 = x1;
            x1 = x2;
            x2 += x3;
        }
        return x2;
    }

    static int num = 2;
    static int result = 1;
    public static int numberFibRec(int n){  //метод с рекурсией
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return numberFibRec(n - 1) + numberFibRec(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(numberFibRec(i) + " ");
            //System.out.print(numberFib(i) + " ");
        }
    }
}
