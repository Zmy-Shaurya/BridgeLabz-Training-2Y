import java.util.Scanner;

class q10_digitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!input.hasNextLong()) {
            System.err.println("Invalid input. Enter integer.");
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
        long tmp = number;
        if (tmp == 0) count = 1;
        while (tmp > 0) { count++; tmp /= 10; }

        int[] digits = new int[count];
        tmp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(tmp % 10);
            tmp /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Digit frequencies:");
        for (int d = 0; d <= 9; d++) {
            System.out.printf("%d : %d%n", d, freq[d]);
        }

        input.close();
    }
}
