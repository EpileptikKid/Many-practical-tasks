//Ввести значение eps и найти сумму ряда
//y = 1 + 1/2 + 1/4 + 1/8 + 1/16 + ...
//Добавлять слагаемые до тех пор, пока очередное слагаемое не станет меньше eps.


import java.util.Scanner;
public class task_2 {
    public static double doubleTwo(double eps){
        double x = 1;
        double result = 0;
        while (x > eps) {
            result += x;
            x /= 2;
        }
        return(result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите eps");
        double eps = scanner.nextDouble();
        System.out.println(task_2.doubleTwo(eps));
    }
}
