package Java_Coding_Problems.Chapter_1_Strings_Numbers_And_Math;

public class RemovingSpacesFromString {
    public static String removeWhitespaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
