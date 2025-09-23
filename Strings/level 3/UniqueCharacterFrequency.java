import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static char[] findUniqueCharacters(String text) {
        char[] tempUnique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempUnique[uniqueCount++] = currentChar;
            }
        }

        char[] finalResult = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalResult[i] = tempUnique[i];
        }
        return finalResult;
    }

    public static String[][] getFrequenciesOfUniques(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            result[i][0] = String.valueOf(uniqueChar);
            result[i][1] = String.valueOf(frequency[uniqueChar]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String input = scanner.nextLine();

        String[][] frequencies = getFrequenciesOfUniques(input);

        System.out.println("\n--- Unique Character Frequency Report ---");
        System.out.printf("%-12s | %s%n", "Character", "Frequency");
        System.out.println("---------------------------------------");
        for (String[] row : frequencies) {
            System.out.printf("%-12s | %s%n", row[0], row[1]);
        }
        scanner.close();
    }
}