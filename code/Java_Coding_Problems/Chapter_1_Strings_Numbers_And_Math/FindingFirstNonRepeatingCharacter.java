package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindingFirstNonRepeatingCharacter {

    private static final int EXTENDED_ASCII_CODES = 256;
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println(firstNonRepeatedCharacterFirstMethod("hello world"));
        System.out.println(firstNonRepeatedCharacterSecondMethod("hello world"));
    }

    public static char firstNonRepeatedCharacterFirstMethod(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        Arrays.fill(flags, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    public static char firstNonRepeatedCharacterSecondMethod(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (char ch: str.toCharArray()) {
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

}
