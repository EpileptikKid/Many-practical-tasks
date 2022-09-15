//Implement a program to find Fibonacci numbers:
//The search for the n-th Fibonacci number is carried out in a separate function.
//In the main() function, enter the index and display all Fibonacci numbers up to and including the entered number.
//Implement two options - using a loop and using recursion.

import java.util.Scanner;

public class task_8 {
    public static int numberFib(int n){  //loop method
        int x1 = 1;
        int x2 = 1;
        int x3;
        for (int i = 3; i <= n; i++){
            x3 = x1;
            x1 = x2;
            x2 += x3;
        }
        return x2;
    }

    public static int numberFibRec(int n){  //method with recursion
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return numberFibRec(n - 1) + numberFibRec(n - 2);
        }
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = scanner.nextInt();
            System.out.println("(loop method) Series of fibonacci numbers:");
            for (int i = 1; i <= n; i++) {
                System.out.print(numberFib(i) + " ");
            }
            System.out.println();
            System.out.println("(method with recursion) Series of fibonacci numbers:");
            for (int i = 1; i <= n; i++) {
                System.out.print(numberFibRec(i) + " ");
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
