import java.util.Scanner;

public class ToLowerCaseConverter {
    
    public static String toLowerCaseCustom(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
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
        System.out.print("Enter a line of text to convert to lowercase: ");
        String input = scanner.nextLine();
        
        String customLower = toLowerCaseCustom(input);
        System.out.println("\nResult from custom method: " + customLower);

        String builtinLower = input.toLowerCase();
        System.out.println("Result from built-in method: " + builtinLower);

        boolean areEqual = compareStringsCustom(customLower, builtinLower);
        System.out.println("\nDo the results match? " + areEqual);

        scanner.close();
    }
}