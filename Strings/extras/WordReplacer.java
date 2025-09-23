import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll(wordToReplace, replacementWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + result);
        scanner.close();
    }
}