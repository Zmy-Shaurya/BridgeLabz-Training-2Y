import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        scanner.close();

        if (year >= 1582) {
            // Single If Statement with Logical Operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }

        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
    }
}
