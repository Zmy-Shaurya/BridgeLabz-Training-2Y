import java.util.Scanner;

public class SpecialNumberChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNeonNumber(int number) {
        if (number < 0) return false;
        long square = (long) number * number;
        long sumOfDigits = 0;
        long temp = square;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        if (number < 0) return false;
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        if (number < 0) return false;
        long square = (long) number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Is it a Prime number? " + isPrime(num));
        System.out.println("Is it a Neon number? " + isNeonNumber(num));
        System.out.println("Is it a Spy number? " + isSpyNumber(num));
        System.out.println("Is it an Automorphic number? " + isAutomorphicNumber(num));
        System.out.println("Is it a Buzz number? " + isBuzzNumber(num));
        
        scanner.close();
    }
}