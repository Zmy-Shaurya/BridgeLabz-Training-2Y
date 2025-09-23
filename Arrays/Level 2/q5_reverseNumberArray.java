import java.util.Scanner;

class q5_reverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!input.hasNextLong()) {
            System.err.println("Invalid input. Enter integer number.");
            input.close();
            return;
        }
        long number = input.nextLong();
        if (number < 0) {
            System.err.println("Invalid number. Must be non-negative.");
            input.close();
            return;
        }

        int count = 0;
        long temp = number;
        if (temp == 0) count = 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println();

        long reversed = 0;
        for (int i = 0; i < count; i++) {
            reversed = reversed * 10 + digits[i];
        }
        System.out.printf("Reversed number: %d%n", reversed);

        input.close();
    }
}
