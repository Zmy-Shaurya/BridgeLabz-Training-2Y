import java.util.Scanner;
import java.util.Arrays;

public class FactorCalculator {

    public static int[] findFactors(int number) {
        if (number <= 0) {
            return new int[0];
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static long sumFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productFactors(int[] factors) {
        if (factors.length == 0) {
            return 0;
        }
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long sumOfSquareFactors(int[] factors) {
        long sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));

        long sum = sumFactors(factors);
        System.out.println("Sum of factors: " + sum);

        long product = productFactors(factors);
        System.out.println("Product of factors: " + product);

        long sumOfSquares = sumOfSquareFactors(factors);
        System.out.println("Sum of square of factors: " + sumOfSquares);

        scanner.close();
    }
}