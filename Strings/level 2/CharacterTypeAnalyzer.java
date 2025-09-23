import java.util.Scanner;

public class CharacterTypeAnalyzer {
    
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    
    public static String[][] findCharacterTypes(String text) {
        String[][] results = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            results[i][0] = String.valueOf(c);
            results[i][1] = checkCharType(c);
        }
        return results;
    }
    
    public static void displayResults(String[][] results) {
        System.out.println("\n--- Character Analysis Report ---");
        System.out.printf("%-12s | %s%n", "Character", "Type");
        System.out.println("---------------------------------");
        for (String[] row : results) {
            System.out.printf("%-12s | %s%n", row[0], row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String input = scanner.nextLine();
        
        String[][] analysis = findCharacterTypes(input);
        displayResults(analysis);
        
        scanner.close();
    }
}