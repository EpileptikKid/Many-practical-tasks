//Ввести значение n (от 0 до 10) и вывести значения степеней числа 8 до n включительно.
//Реализовать два подхода – с использованием арифметических и побитовых операций.


import java.util.Scanner;
public class task_3 {

    public static int eightStepInt(int n){   //арифметические операции
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 8;
        }
        return(result);
    }

    public static int eightStepByte(int n){  //побитовьіе операции
        int result = 1;
        return(result<<n*3);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение n от 0 до 10");
        int n = scanner.nextInt();
        if (n >= 0 & n < 11) {
            System.out.println(eightStepInt(n));
            System.out.println(eightStepByte(n));
        } else {
            System.out.println("тьі еблан");
        }
    }
}
