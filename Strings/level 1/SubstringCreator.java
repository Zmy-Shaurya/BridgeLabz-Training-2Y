import java.util.Scanner;

public class SubstringCreator {

    public static String createSubstringCustom(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return "Invalid indices";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
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

        System.out.print("Enter the original string: ");
        String original = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        String customSub = createSubstringCustom(original, startIndex, endIndex);
        System.out.println("\nSubstring from custom method: " + customSub);

        String builtinSub = original.substring(startIndex, endIndex);
        System.out.println("Substring from built-in method: " + builtinSub);
        
        boolean areSame = compareStringsCustom(customSub, builtinSub);
        System.out.println("\nAre the two substrings equal? " + areSame);

        scanner.close();
    }
}