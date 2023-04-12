package java_core_task;//Implement a program to find prime numbers. Checking whether a number is prime is done in a separate function
//that takes an integer and returns a boolean result.
//In the main() function, enter the required range and display all prime numbers in this range.

import java.util.Scanner;

public class task_7 {
    public static boolean checkSimpleNumber(int n){
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter start of range");
            int min = scanner.nextInt();
            System.out.println("Enter the end of the range");
            int max = scanner.nextInt();
            System.out.println("List of prime numbers up to n:");
            for (int i = min; i <= max; i++) {
                if (checkSimpleNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
