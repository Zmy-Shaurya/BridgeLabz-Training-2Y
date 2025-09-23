import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerAdvanced {

    public static int[] getDigitsArray(long number) {
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(long number) {
        int[] originalDigits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(originalDigits);
        return areArraysEqual(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(long number) {
        if (number <= 0) return false;
        long tempNum = number;
        while (tempNum > 0) {
            if (tempNum % 10 == 0) {
                return true;
            }
            tempNum /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        int[] digits = getDigitsArray(num);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigitsArray(digits)));
        System.out.println("Is the number a palindrome? " + isPalindrome(num));
        System.out.println("Is the number a Duck number? " + isDuckNumber(num));

        scanner.close();
    }
}