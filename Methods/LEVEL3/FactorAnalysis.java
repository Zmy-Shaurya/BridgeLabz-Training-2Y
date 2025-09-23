import java.util.Scanner;
import java.util.Arrays;

public class FactorAnalysis {

    public static int[] getFactors(int number) {
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

    public static int findGreatestFactor(int[] factors) {
        if (factors.length < 2) {
            return -1; 
        }
        return factors[factors.length - 2];
    }

    public static long findSumOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static double findProductOfFactors(int[] factors) {
        if (factors.length == 0) {
            return 0;
        }
        double product = 1.0;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static double findProductOfCubeOfFactors(int[] factors) {
        if (factors.length == 0) {
            return 0;
        }
        double product = 1.0;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] factors = getFactors(num);
        System.out.println("The factors are: " + Arrays.toString(factors));

        int greatestFactor = findGreatestFactor(factors);
        if (greatestFactor != -1) {
            System.out.println("The greatest factor (other than the number itself) is: " + greatestFactor);
        } else {
            System.out.println("The number does not have a proper factor.");
        }
        
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        System.out.printf("Product of factors: %.0f%n", findProductOfFactors(factors));
        System.out.printf("Product of the cube of factors: %.0f%n", findProductOfCubeOfFactors(factors));
        
        scanner.close();
    }
}