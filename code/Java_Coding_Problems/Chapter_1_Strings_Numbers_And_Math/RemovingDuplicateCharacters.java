package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacters {
    public static String firstRemoveDuplicates(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String secondRemoveDuplicates(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();

        for (char ch : chArray) {
            if (chHashSet.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String thirdRemoveDuplicates(String str) {
        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
