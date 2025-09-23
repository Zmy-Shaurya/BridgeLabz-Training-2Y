import java.util.Scanner;
import java.util.Arrays;

public class CharacterFrequencyNested {

    public static String[] getCharacterFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] frequencies = new int[chars.length];
        int distinctCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\0') continue;
            
            distinctCount++;
            frequencies[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequencies[i]++;
                    chars[j] = '\0'; 
                }
            }
        }
        
        String[] result = new String[distinctCount * 2];
        int resultIndex = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != '\0') {
                result[resultIndex++] = String.valueOf(chars[i]);
                result[resultIndex++] = String.valueOf(frequencies[i]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String input = scanner.nextLine();

        String[] frequencies = getCharacterFrequencies(input);
        
        System.out.println("\n--- Character Frequency Report ---");
        for(int i = 0; i < frequencies.length; i += 2) {
            System.out.println("Character: '" + frequencies[i] + "', Frequency: " + frequencies[i+1]);
        }

        scanner.close();
    }
}