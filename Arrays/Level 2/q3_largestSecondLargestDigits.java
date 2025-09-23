import java.util.Scanner;

class q3_largestSecondLargestDigits {
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

        final int MAX_DIGIT = 10;
        int[] digits = new int[MAX_DIGIT];
        int index = 0;
        while (number != 0 && index < MAX_DIGIT) {
            digits[index++] = (int)(number % 10);
            number /= 10;
        }
        if (index == 0) { // number was 0
            digits[index++] = 0;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.printf("Largest digit: %d%n", largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit: not present");
        } else {
            System.out.printf("Second largest digit: %d%n", secondLargest);
        }

        input.close();
    }
}
