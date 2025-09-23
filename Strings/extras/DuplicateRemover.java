import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        scanner.close();
    }
}