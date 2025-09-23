import java.util.Scanner;

public class StringIndexExceptionDemo {

    public static void demonstrateException(String text) {
        try {
            System.out.println("Attempting to access an invalid index...");
            char ch = text.charAt(text.length());
            System.out.println("Character retrieved: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught successfully!");
            System.out.println("Error: The index you are trying to access is outside the string's bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        demonstrateException(input);
        
        scanner.close();
    }
}