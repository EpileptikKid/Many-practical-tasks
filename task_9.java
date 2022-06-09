//Реализовать и протестировать функцию, которая вычисляет π с точностью до заданного ε
//Параметром функции должна быть точность (ε). Вычисление должно прекращаться, если очередное слагаемое меньше ε по абсолютной величине
//Реализовать два варианта - с использованием цикла и с использованием рекурсии.

import java.util.Scanner;

public class task_9 {
    public static double epsPi(double eps){
        double q = 1;
        double result = 3;
        for (int i = 2; q >= eps; i += 2){
            q = (double) 4 / (i * (i+1) * (i+2));
            if (i%4 == 0){
                result -= q;
            } else {
                result += q;
            }
        }
        return result;
    }

    public static double epsPiRec(double eps, int n){
        double z = (double) 4/((n*2)*(n*2+1)*(n*2+2));
        if (z < eps) {
            return z;
        } else {
            return z - epsPiRec(eps, n + 1);
        }
    }

    public static double epsPiRec(double eps){
        return epsPiRec(eps, 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ε");
        double eps = scanner.nextDouble();
        System.out.println(3 + epsPiRec(eps));
        System.out.println(epsPi(eps));
    }
}
