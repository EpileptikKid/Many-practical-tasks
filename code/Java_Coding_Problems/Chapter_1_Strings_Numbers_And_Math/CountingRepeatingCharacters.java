package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(countDuplicateCharactersCycleMethod("hello World"));
        System.out.println(countDuplicateCharactersStreamMethod("hello World"));
    }

    public static Map<Character, Integer> countDuplicateCharactersCycleMethod(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch: str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharactersStreamMethod(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
