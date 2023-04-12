package java_core_task;//Ввести с клавиатуры строку. Удалить лишние пробелы, в том числе начальные и конечные
//Внутри слов большие буквы заменить маленькими
//Если перед словами, начинающимися с большой буквы, нет точки, добавить точку в конце предшествующих слов
//Сформировать и вывести на экран слова, начинающиеся на мягкий знак

import java.util.Scanner;

public class task_4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++){
            strArr[i] = strArr[i].charAt(0) + strArr[i].toLowerCase().substring(1);
        }
        for (int i = 1; i < strArr.length; i++){
            if (!strArr[i].equals(strArr[i].toLowerCase()) & !strArr[i-1].endsWith(".")) {
                strArr[i-1] = strArr[i-1].concat(".");
            }
        }
        for (String n : strArr){
            if (n.toLowerCase().startsWith("ь")) {
                System.out.print(n + " ");
            }
        }
    }
}
