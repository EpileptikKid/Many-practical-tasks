package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

public class CheckContainsOnlyDigits {
    public static boolean firstContainsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //low method
    public static boolean secondContainsOnlyDigits(String str) {
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }
}
