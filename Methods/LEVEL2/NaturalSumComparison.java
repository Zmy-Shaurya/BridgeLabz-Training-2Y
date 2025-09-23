import java.util.Scanner;

public class NaturalSumComparison {

    public static long recursiveSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + recursiveSum(n - 1);
    }

    public static long formulaSum(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Input is not a natural number.");
        } else {
            long sumFromRecursion = recursiveSum(n);
            long sumFromFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumFromRecursion);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFromFormula);

            if (sumFromRecursion == sumFromFormula) {
                System.out.println("Both computations are correct and yield the same result.");
            } else {
                System.out.println("The results from the computations do not match.");
            }
        }
        scanner.close();
    }
}