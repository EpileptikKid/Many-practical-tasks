//Ввести с клавиатуры строку из нескольких слов. Составить строку из первых букв слов с переводом этих букв в верхний регистр

import java.util.Scanner;
import java.util.StringTokenizer;

public class task_4_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken().toUpperCase().charAt(0));
        }
    }
}
