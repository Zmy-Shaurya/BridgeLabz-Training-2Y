import java.util.Scanner;
import java.util.Arrays;

public class CustomStringSplit {

    public static String[] splitCustom(String text) {
        text = text.trim(); 
        if (text.isEmpty()) {
            return new String[0];
        }

        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; 

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int lastSpaceIndex = -1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(lastSpaceIndex + 1, i);
                wordIndex++;
                lastSpaceIndex = i;
            }
        }
        words[wordIndex] = text.substring(lastSpaceIndex + 1);

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text to split: ");
        String input = scanner.nextLine();
        
        String[] customSplit = splitCustom(input);
        System.out.println("\nResult from custom split: " + Arrays.toString(customSplit));
        
        String[] builtinSplit = input.split(" ");
        System.out.println("Result from built-in split: " + Arrays.toString(builtinSplit));
        
        boolean areEqual = compareStringArrays(customSplit, builtinSplit);
        System.out.println("\nAre the results equal? " + areEqual);

        scanner.close();
    }
}