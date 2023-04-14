package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingVowelsAndConsonants {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map.Entry<Integer, Integer> firstCountVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (allVowels.contains(ch)) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        return Map.entry(vowels, consonant);
    }

    public static Map.Entry<Long, Long> secondCountVowelsAndConsonant(String str) {
        str = str.toLowerCase();

        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();
        long consonant = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Map.entry(vowels, consonant);
    }

    public static Map.Entry<Long, Long> threadCountVowelsAndConsonant(String str) {
        str = str.toLowerCase();

        Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(c -> allVowels.contains(c), Collectors.counting()));

        return Map.entry(result.get(true), result.get(false));
    }
}
