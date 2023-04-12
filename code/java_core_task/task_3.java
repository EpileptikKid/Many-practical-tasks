package java_core_task;//Enter the value of n (from 0 to 10) and output the values of the powers of 8 up to and including n.
//Implement two approaches - using arithmetic and bitwise operations.

import java.util.Scanner;
public class task_3 {

    public static void eightStepInt(int n) {   //arithmetic operations
        System.out.println("Arithmetic operations:");
        int result = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println("8 to the power of " + i + " - " + result);
            result *= 8;
        }
    }

    public static void eightStepByte(int n) {  //bitwise operations
        System.out.println("Bitwise operations:");
        int result = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println("8 to the power of " + i + " - " + result);
            result = result<<3;
        }
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a value for n from 0 to 10");
            int n = scanner.nextInt();
            if (n >= 0 & n < 11) {
                eightStepInt(n);
                System.out.println();
                eightStepByte(n);
            } else {
                System.out.println("The entered number is out of range");
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
