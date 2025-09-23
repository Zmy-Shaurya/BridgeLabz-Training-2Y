import java.util.Scanner;

public class NumberClassifier {

    private static int getSumOfProperDivisors(int number) {
        if (number <= 1) {
            return 0;
        }
        int sum = 1; 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return number > 1 && getSumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return number > 1 && getSumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return number > 1 && getSumOfProperDivisors(number) < number;
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static boolean isStrongNumber(int number) {
        if (number < 0) return false;
        int sumOfFactorials = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        System.out.println("Is it a Perfect number? " + isPerfectNumber(num));
        System.out.println("Is it an Abundant number? " + isAbundantNumber(num));
        System.out.println("Is it a Deficient number? " + isDeficientNumber(num));
        System.out.println("Is it a Strong number? " + isStrongNumber(num));

        scanner.close();
    }
}