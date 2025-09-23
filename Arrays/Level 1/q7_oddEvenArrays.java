import java.util.Scanner;

class q7_oddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (>=1): ");
        int number = sc.nextInt();
        if (number < 1) {
            System.err.println("Error: number must be a natural number (>=1).");
            sc.close();
            return;
        }

        int size = number / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int ei = 0, oi = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[ei++] = i;
            } else {
                odds[oi++] = i;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + (i + 1 < ei ? ", " : "\n"));

        System.out.println("Odd numbers:");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + (i + 1 < oi ? ", " : "\n"));

        sc.close();
    }
}
