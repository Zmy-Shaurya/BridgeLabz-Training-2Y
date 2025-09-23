import java.util.Scanner;

public class LexicographicalComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = scanner.nextLine();

        int result = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        int minLength = len1 < len2 ? len1 : len2;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (result == 0 && len1 != len2) {
            result = len1 - len2;
        }

        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
        scanner.close();
    }
}