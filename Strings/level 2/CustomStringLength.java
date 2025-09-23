import java.util.Scanner;

public class CustomStringLength {

    public static int getCustomLength(String text) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                text.charAt(i);
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = getCustomLength(input);
        System.out.println("\nLength from custom method: " + customLength);

        int builtinLength = input.length();
        System.out.println("Length from built-in method: " + builtinLength);

        scanner.close();
    }
}
