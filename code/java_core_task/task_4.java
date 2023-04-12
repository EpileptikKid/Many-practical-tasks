package java_core_task;//Change the program for the binary representation of the number so that zeros are not displayed at the beginning.
//Use a boolean variable to indicate if the first one is zero.

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number in decimal form from -128 to 127");
            byte n = scanner.nextByte();
            boolean firstZero = true;
            for (int i = 7; i >= 0; i--) {
                if ((byte) (1 & (n >> i)) == 1) {
                    firstZero = false;
                    System.out.print("1");
                } else if (!firstZero) {
                    System.out.print("0");
                }
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
