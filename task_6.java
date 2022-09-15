//Implement a function that calculates the greatest common divisor of two numbers using recursion

import java.util.Scanner;

public class task_6 {

    public static int commonDivisor(int x, int y){
        if (x == y){
            return (x);
        } else {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
            return (commonDivisor(x, y));
        }
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a = scanner.nextInt();
            System.out.println("Enter the second number:");
            int b = scanner.nextInt();
            System.out.println("GSD - " + commonDivisor(a, b));
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
