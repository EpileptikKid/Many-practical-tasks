package java_core_task;//Write a program for the inverted binary representation of a number in reverse order,
//with the least significant bits on the left and the most significant bits on the right.

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number in decimal form from -128 to 127");
            Scanner scanner = new Scanner(System.in);
            byte n = scanner.nextByte();
            for (int i = 0; i <= 7; i++) {
                System.out.print((byte) (1 & (n >> i)));
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
