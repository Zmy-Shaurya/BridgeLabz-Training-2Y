import java.util.Scanner;
import java.util.Arrays;

public class CharArrayConverter {

    public static char[] toCharArrayCustom(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert: ");
        String input = scanner.next();

        char[] customArray = toCharArrayCustom(input);
        System.out.println("\nArray from custom method: " + Arrays.toString(customArray));

        char[] builtinArray = input.toCharArray();
        System.out.println("Array from built-in method: " + Arrays.toString(builtinArray));
        
        boolean areEqual = compareCharArrays(customArray, builtinArray);
        System.out.println("\nAre the two character arrays equal? " + areEqual);

        scanner.close();
    }
}