package java_core_task;//Ввести с клавиатуры строку программного кода. Проверить соответствие фигурных скобок
//Заменить открывающиеся фигурные скобки словом begin, а закрывающиеся – словом end. Использовать класс StringBuilder.

import java.util.Scanner;

public class task_4_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку программного кода");
        String str = scanner.nextLine();
        StringBuilder sbStr = new StringBuilder(str);
        int beg = 0, end = 0;
        while ((sbStr.indexOf("{") != -1) || (sbStr.indexOf("}") != -1)){
            if (sbStr.indexOf("{") != -1){
                sbStr.replace(sbStr.indexOf("{"), sbStr.indexOf("{") + 1, "\nbegin\n");
                beg++;
            }
            if (sbStr.indexOf("}") != -1){
                sbStr.replace(sbStr.indexOf("}"), sbStr.indexOf("}") + 1, "\nend");
                end++;
            }
        }
        if (beg == end) {
            String result = sbStr.toString();
            System.out.println(result);
        } else {
            System.out.println("error");
        }
    }
}
