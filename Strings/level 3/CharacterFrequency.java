import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] getCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int distinctCharCount = 0;

        for (int i = 0; i < text.length(); i++) {
            int charAscii = text.charAt(i);
            if (frequency[charAscii] == 0) {
                distinctCharCount++;
            }
            frequency[charAscii]++;
        }

        String[][] result = new String[distinctCharCount][2];
        int resultIndex = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[resultIndex][0] = String.valueOf((char) i);
                result[resultIndex][1] = String.valueOf(frequency[i]);
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String input = scanner.nextLine();

        String[][] frequencies = getCharacterFrequencies(input);

        System.out.println("\n--- Character Frequency Report ---");
        System.out.printf("%-12s | %s%n", "Character", "Frequency");
        System.out.println("----------------------------------");
        for (String[] row : frequencies) {
            System.out.printf("%-12s | %s%n", row[0], row[1]);
        }
        scanner.close();
    }
}