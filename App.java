import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n в диапазоне от 0 до 30");
        int n = scanner.nextInt();
        if (n < 0 || n > 30) {
            System.err.println("Неправильное значение n!");
        }
        else {
            for (int i = 0; i <= n; i++) {
                System.out.printf("2 ^ %2d = %d\n", i, 1 << i);
            }
        }
    }
}
