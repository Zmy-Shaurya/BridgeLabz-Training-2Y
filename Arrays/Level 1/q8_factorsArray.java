import java.util.Arrays;
import java.util.Scanner;

class q8_factorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.err.println("Invalid input. Number must be positive.");
            sc.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == factors.length) {
                    // need to grow
                    maxFactor = maxFactor * 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[idx++] = i;
            }
        }

        System.out.println("Factors of " + n + ":");
        for (int i = 0; i < idx; i++) {
            System.out.println(factors[i]);
        }

        sc.close();
    }
}
