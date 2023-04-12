package java_core_task;//Implement and test a function that calculates π up to a given ε
//The function parameter must be precision (ε). The calculation should stop if the next term is less than ε in absolute value
//Implement two options - using a loop and using recursion.

import java.util.Scanner;

public class task_9 {
    public static double epsPi(double eps){  //loop method
        double q = 1;
        double result = 3;
        for (int i = 2; q >= eps; i += 2){
            q = (double) 4 / (i * (i+1) * (i+2));
            if (i%4 == 0){
                result -= q;
            } else {
                result += q;
            }
        }
        return result;
    }

    public static double epsPiRec(double eps, int n){  //method with recursion
        double z = (double) 4/((n*2)*(n*2+1)*(n*2+2));
        if (z < eps) {
            return z;
        } else {
            return z - epsPiRec(eps, n + 1);
        }
    }

    public static double epsPiRec(double eps){
        return epsPiRec(eps, 1);
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter ε:");
            double eps = scanner.nextDouble();
            System.out.println("Method with recursion - " + (3 + epsPiRec(eps)));
            System.out.println("Loop method - " + epsPi(eps));
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
