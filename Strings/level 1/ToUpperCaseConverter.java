import java.util.Scanner;

public class ToUpperCaseConverter {

    public static String toUpperCaseCustom(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
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
        System.out.print("Enter a line of text to convert to uppercase: ");
        String input = scanner.nextLine();

        String customUpper = toUpperCaseCustom(input);
        System.out.println("\nResult from custom method: " + customUpper);
        
        String builtinUpper = input.toUpperCase();
        System.out.println("Result from built-in method: " + builtinUpper);

        boolean areEqual = compareStringsCustom(customUpper, builtinUpper);
        System.out.println("\nDo the results match? " + areEqual);

        scanner.close();
    }
}