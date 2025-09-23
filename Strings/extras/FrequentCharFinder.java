import java.util.Scanner;

public class FrequentCharFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequencies = new int[256];
        for (char ch : input.toCharArray()) {
            frequencies[ch]++;
        }

        int maxFrequency = -1;
        char mostFrequentChar = ' ';
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        scanner.close();
    }
}