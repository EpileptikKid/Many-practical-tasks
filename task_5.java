//Написать программу инвертированного двоичного представления числа так
//в обратном порядке, слева – младшие биты, а справа – старшие

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        for (int i = 0; i <= 7; i++) {
            System.out.print((byte)(1 & (n >> i)));
        }
    }
}
