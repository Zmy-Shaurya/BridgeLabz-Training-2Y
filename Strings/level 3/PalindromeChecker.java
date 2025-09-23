import java.util.Scanner;
import java.util.Arrays;

public class PalindromeChecker {

    // Logic 1: Iterative check
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text) {
        return recursiveHelper(text, 0, text.length() - 1);
    }
    
    private static boolean recursiveHelper(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return recursiveHelper(text, start + 1, end - 1);
    }

    // Logic 3: Reverse and compare
    public static boolean isPalindromeByReverse(String text) {
        char[] originalChars = text.toCharArray();
        String reversedString = new StringBuilder(text).reverse().toString();
        char[] reversedChars = reversedString.toCharArray();
        return Arrays.equals(originalChars, reversedChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Palindrome Check Results ---");
        
        boolean result1 = isPalindromeIterative(input);
        System.out.println("Logic 1 (Iterative): Is it a palindrome? " + result1);
        
        boolean result2 = isPalindromeRecursive(input);
        System.out.println("Logic 2 (Recursive): Is it a palindrome? " + result2);
        
        boolean result3 = isPalindromeByReverse(input);
        System.out.println("Logic 3 (Reverse): Is it a palindrome? " + result3);
        
        scanner.close();
    }
}