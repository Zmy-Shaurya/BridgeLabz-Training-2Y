import java.util.Scanner;
import java.util.Arrays;

public class NumberProperties {

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

    public static int findSumOfDigits(long number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double findSumOfSquaresOfDigits(long number) {
        int[] digits = getDigitsArray(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }
    
    public static boolean isHarshadNumber(long number) {
        if (number <= 0) return false;
        int sum = findSumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(long number) {
        int[] digits = getDigitsArray(number);
        int[] frequencies = new int[10];
        for (int digit : digits) {
            frequencies[digit]++;
        }

        int nonZeroFreqCount = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                nonZeroFreqCount++;
            }
        }
        
        int[][] result = new int[nonZeroFreqCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequencies[i] > 0) {
                result[index][0] = i; 
                result[index][1] = frequencies[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("Sum of digits: " + findSumOfDigits(num));
        System.out.println("Sum of squares of digits: " + findSumOfSquaresOfDigits(num));
        System.out.println("Is it a Harshad number? " + isHarshadNumber(num));
        
        System.out.println("Digit Frequency (Digit, Count):");
        int[][] frequency = findDigitFrequency(num);
        for (int[] row : frequency) {
            System.out.println(row[0] + ", " + row[1]);
        }
        
        scanner.close();
    }
}