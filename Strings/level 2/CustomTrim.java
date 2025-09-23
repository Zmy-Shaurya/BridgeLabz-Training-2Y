import java.util.Scanner;

public class CustomTrim {

    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstringCustom(String text, int start, int end) {
        if (start > end) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    
    public static boolean compareStringsCustom(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        int[] indices = findTrimIndices(input);
        String customTrimmed = createSubstringCustom(input, indices[0], indices[1]);
        System.out.println("\nResult from custom trim method: \"" + customTrimmed + "\"");
        
        String builtinTrimmed = input.trim();
        System.out.println("Result from built-in trim() method: \"" + builtinTrimmed + "\"");
        
        boolean areEqual = compareStringsCustom(customTrimmed, builtinTrimmed);
        System.out.println("\nDo the results match? " + areEqual);

        scanner.close();
    }
}