package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InvertLettersAndWords {
    private static final String WHITESPACE = " ";
    private static final Pattern PATTERN = Pattern.compile(" +");
    public static void main(String[] args) {

    }

    public String reverseWordsFirst(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word: words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    public String reverseWordsSecond(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
