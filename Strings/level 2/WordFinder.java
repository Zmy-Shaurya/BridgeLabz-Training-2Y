import java.util.Scanner;

public class WordFinder {

    public static String[] splitCustom(String text) {
        text = text.trim();
        if (text.isEmpty()) {
            return new String[0];
        }
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int lastSpaceIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(lastSpaceIndex + 1, i);
                lastSpaceIndex = i;
            }
        }
        words[wordIndex] = text.substring(lastSpaceIndex + 1);
        return words;
    }

    public static int getCustomLength(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i++);
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i - 1;
        }
    }
    
    public static String[][] getWordsAndLengths(String text) {
        String[] words = splitCustom(text);
        if (words.length == 0) return new String[0][0];
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getCustomLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordsAndLengths) {
        if (wordsAndLengths.length == 0) {
            return new String[]{"N/A", "N/A"};
        }
        String shortestWord = wordsAndLengths[0][0];
        String longestWord = wordsAndLengths[0][0];
        int minLength = Integer.parseInt(wordsAndLengths[0][1]);
        int maxLength = Integer.parseInt(wordsAndLengths[0][1]);

        for (int i = 1; i < wordsAndLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsAndLengths[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortestWord = wordsAndLengths[i][0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWord = wordsAndLengths[i][0];
            }
        }
        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[][] wordsAndLengths = getWordsAndLengths(input);
        String[] result = findShortestAndLongest(wordsAndLengths);

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        scanner.close();
    }
}