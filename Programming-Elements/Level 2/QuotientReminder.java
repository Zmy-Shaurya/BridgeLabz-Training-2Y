import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int quotient = number1 / number2;
        int reminder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
    }
}
