//Ввести с клавиатуры строку. Удалить из строки все цифры
//Рассортировать все ее символы по алфавиту
//Вывести полученные символы в виде новой строки

import java.util.Arrays;
import java.util.Scanner;

public class task_4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        char[] arrStr = str.toCharArray();

        StringBuilder resultBuilder = new StringBuilder();
        Arrays.sort(arrStr);
        for (char n : arrStr){
            if (!Character.isDigit(n)) {
                resultBuilder.append(n);
            }
        }
        String result = new String(resultBuilder);
        result = result.trim();


        System.out.println(result);
        System.out.println(result.length());

    }
}
