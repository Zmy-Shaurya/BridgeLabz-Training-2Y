import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker {

    public static int countDigits(long number) {
        if (number == 0) return 1;
        int count = 0;
        long tempNum = Math.abs(number);
        while (tempNum > 0) {
            tempNum /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigitsArray(long number) {
        if (number == 0) return new int[]{0};
        long tempNum = Math.abs(number);
        int size = countDigits(tempNum);
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = (int)(tempNum % 10);
            tempNum /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(long number) {
        long tempNum = Math.abs(number);
        while (tempNum > 0) {
            if (tempNum % 10 == 0) {
                return true;
            }
            tempNum /= 10;
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(long number) {
        if (number < 0) return false;
        int[] digits = getDigitsArray(number);
        int n = digits.length;
        long sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }
    
    public static int[] findLargestAndSecondLargest(long number) {
        int[] digits = getDigitsArray(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(long number) {
        int[] digits = getDigitsArray(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("Is it a Duck number? " + isDuckNumber(num));
        System.out.println("Is it an Armstrong number? " + isArmstrongNumber(num));

        int[] largest = findLargestAndSecondLargest(num);
        System.out.println("Largest digit: " + largest[0] + ", Second largest digit: " + (largest[1] == Integer.MIN_VALUE ? "N/A" : largest[1]));

        int[] smallest = findSmallestAndSecondSmallest(num);
        System.out.println("Smallest digit: " + smallest[0] + ", Second smallest digit: " + (smallest[1] == Integer.MAX_VALUE ? "N/A" : smallest[1]));

        scanner.close();
    }
}