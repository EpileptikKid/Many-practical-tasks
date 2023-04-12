package java_core_task;//Enter a string from the keyboard. Remove extra spaces, including leading and trailing spaces
//Replace capital letters with small letters inside words
//If there is no period before words beginning with a capital letter, add a period at the end of preceding words
//Form and display words that begin with a soft sign

import java.util.Scanner;

public class task_4_1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = scanner.nextLine();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");

            String[] strArr = str.split(" ");

            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i].charAt(0) + strArr[i].toLowerCase().substring(1);
            }
            for (int i = 1; i < strArr.length; i++) {
                if (!strArr[i].equals(strArr[i].toLowerCase()) & !strArr[i - 1].endsWith(".")) {
                    strArr[i - 1] = strArr[i - 1].concat(".");
                }
            }
            for (String n : strArr) {
                if (n.toLowerCase().startsWith("ь")) {
                    System.out.print(n + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("The entered data is incorrect");
        }
    }
}
