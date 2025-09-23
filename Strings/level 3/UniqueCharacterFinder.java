import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharacterFinder {

    public static int getCustomLength(String text) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                text.charAt(i);
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[getCustomLength(text)];
        int uniqueCount = 0;

        for (int i = 0; i < getCustomLength(text); i++) {
            char currentChar = text.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] finalResult = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalResult[i] = uniqueChars[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find unique characters: ");
        String input = scanner.nextLine();

        char[] result = findUniqueCharacters(input);
        System.out.println("\nThe unique characters are: " + Arrays.toString(result));

        scanner.close();
    }
}