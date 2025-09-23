import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void demonstrateException(String text) {
        try {
            System.out.println("Attempting to parse a non-numeric string to an integer...");
            int number = Integer.parseInt(text);
            System.out.println("Successfully parsed! The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught successfully!");
            System.out.println("Error: The input string '" + text + "' is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text to parse as a number (e.g., 'abc' or '123'): ");
        String input = scanner.nextLine();
        
        demonstrateException(input);
        
        scanner.close();
    }
}