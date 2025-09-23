import java.util.Scanner;

public class WordLengthAnalyzer {

    public static String[] splitTextIntoWords(String text) {
        return text.trim().split(" ");
    }

    public static int getCustomLength(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }

    public static String[][] getWordsAndLengths(String text) {
        String[] words = splitTextIntoWords(text);
        if (words.length == 1 && words[0].isEmpty()) {
            return new String[0][0];
        }

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getCustomLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[][] wordsWithLengths = getWordsAndLengths(input);
        
        System.out.println("\n--- Word Analysis ---");
        System.out.printf("%-20s %s%n", "Word", "Length");
        System.out.println("-------------------------");

        for (String[] row : wordsWithLengths) {
            System.out.printf("%-20s %s%n", row[0], row[1]);
        }
        
        scanner.close();
    }
}