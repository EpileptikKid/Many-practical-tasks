//Write a program that solves a quadratic equation

import java.util.Scanner;
public class task_1 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quadratic equation in the form ax2 + bx + c = 0");
            double a, b, c, d;
            System.out.println("Enter a:");
            a = scanner.nextFloat();
            System.out.println("Enter b:");
            b = scanner.nextFloat();
            System.out.println("Enter c:");
            c = scanner.nextFloat();
            d = Math.pow(b, 2) - (4 * a * c);
            double x1, x2;
            if (d > 0) {
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.printf("x1 = %f\nx2 = %f", x1, x2);
            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.printf("x1,2 = %f\n", x1);
            } else {
                System.out.println("No roots");
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
