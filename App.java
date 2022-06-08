import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Квадратное уравнение в виде ax2 + bx + c = 0");
        double a, b, c, d;
        System.out.println("Введите a");
        a = scanner.nextFloat();
        System.out.println("Введите b");
        b = scanner.nextFloat();
        System.out.println("Введите c");
        c = scanner.nextFloat();
        d = Math.pow(b, 2) - (4 * a * c);
        double x1, x2;
        if (d>0){
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.printf("x1 = %f\n x2 = %f", x1, x2);
        } else if (d==0){
            x1 = -b / (2 * a);
            System.out.printf("x1,2 = %f\n", x1);
        } else {
            System.out.println("корней нет");
        }

        }
    }
