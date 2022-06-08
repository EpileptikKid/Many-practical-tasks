import java.util.Scanner;
public class task_2 {
    public static double doubletwo(double eps){
        double x = 1;
        double result = 0;
        while (Math.abs(x) > eps) {
            result += x;
            x /= 2;
        }
        return(result);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите eps");
        double eps = scanner.nextDouble();
        System.out.println(task_2.doubletwo(eps));
    }
}
