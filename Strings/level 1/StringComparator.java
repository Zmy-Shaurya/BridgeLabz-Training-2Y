import java.util.Scanner;

public class StringComparator {

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

        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        boolean customResult = compareStringsCustom(str1, str2);
        System.out.println("\nResult from custom charAt() method: " + customResult);

        boolean builtinResult = str1.equals(str2);
        System.out.println("Result from built-in equals() method: " + builtinResult);

        scanner.close();
    }
}