import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        String cleanText1 = text1.replaceAll("\\s", "").toLowerCase();
        String cleanText2 = text2.replaceAll("\\s", "").toLowerCase();

        if (cleanText1.length() != cleanText2.length()) {
            return false;
        }

        int[] charFrequencies = new int[256];

        for (int i = 0; i < cleanText1.length(); i++) {
            charFrequencies[cleanText1.charAt(i)]++;
            charFrequencies[cleanText2.charAt(i)]--;
        }

        for (int frequency : charFrequencies) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String input2 = scanner.nextLine();

        if (areAnagrams(input1, input2)) {
            System.out.println("\nThe two texts are anagrams.");
        } else {
            System.out.println("\nThe two texts are not anagrams.");
        }

        scanner.close();
    }
}
