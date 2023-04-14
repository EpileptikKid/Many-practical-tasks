package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

public class CountAppearedSomeSymbol {
    public static int firstCountOccurrencesOfACertainCharacter(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static long secondCountOccurrencesOfACertainCharacter(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
