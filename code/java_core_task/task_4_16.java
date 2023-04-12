package java_core_task;//Проинициализировать одномерный массив строк. Отсортировать массив по алфавиту. Сшить все слова в новую строку


import java.util.Arrays;

public class task_4_16 {
    public static void main(String[] args) {
        Arrays.sort(args);
        StringBuilder result = new StringBuilder();
        for (String s : args){
            result.append(s);
        }
        String res = new String(result);
        System.out.println(res);
    }
}
