//Ввести с клавиатуры строку из нескольких слов, а также некоторую последовательность символов
//Удалить из строки слова, содержащие введенную последовательность символов в виде подстроки


import java.util.Scanner;

public class task_4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите последовательность символов");
        String ch = scanner.next();
        String[] wordsArr = str.split(" ");                             //разбиваем строку на слова

        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].toLowerCase().contains(ch.toLowerCase())) {      //проверяем каждое слово игнорируя регистр
                wordsArr[i] = "";
            }
        }

        for (String n : wordsArr){
            if (!n.equals("")) {
                System.out.print(n + " ");
            }
        }
    }
}
