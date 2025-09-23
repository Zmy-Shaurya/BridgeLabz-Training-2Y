import java.util.Scanner;

public class CaseToggler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String toggled = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                toggled += (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                toggled += (char)(ch - 32);
            } else {
                toggled += ch;
            }
        }
        System.out.println("Toggled case string: " + toggled);
        scanner.close();
    }
}