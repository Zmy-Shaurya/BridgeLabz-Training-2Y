import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}