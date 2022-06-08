//Изменить программу двоичного представления числа так, чтобы не выводились нули вначале.
//Использовать булеву переменную для индикации того, первый ли это ноль.

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в десятичном виде от -128 до 127");
        byte n = scanner.nextByte();
        boolean firstZero = true;
        for (int i = 7; i >= 0; i--) {
            if ((byte)(1 & (n >> i)) == 1){
                firstZero = false;
                System.out.print("1");
            } else if (!firstZero) {
                System.out.print("0");
            }
        }

    }
}
