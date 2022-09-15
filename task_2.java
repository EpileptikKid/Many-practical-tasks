//Enter eps value and find the number of lines
//y = 1 + 1/2 + 1/4 + 1/8 + 1/16 + ...
//Add terms until the next term is less than eps.


import java.util.Scanner;
public class task_2 {
    public static double doubleTwo(double eps){
        double x = 1;
        double result = 0;
        while (x > eps) {
            result += x;
            x /= 2;
        }
        return(result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\n" + "Enter eps");
            double eps = scanner.nextDouble();
            System.out.println(task_2.doubleTwo(eps));
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
