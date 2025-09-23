import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    public static void demonstrateException(String text) {
        try {
            System.out.println("Attempting to create a substring with invalid arguments (start > end)...");
            String sub = text.substring(4, 1);
            System.out.println("Substring result: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught successfully!");
            System.out.println("Error: The arguments provided to the method were invalid.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (at least 5 characters long): ");
        String input = scanner.nextLine();

        demonstrateException(input);

        scanner.close();
    }
}