import java.util.Scanner;

public class DivisionCalculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return new int[]{0, 0};
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend (the number to be divided): ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        int[] result = findRemainderAndQuotient(dividend, divisor);

        System.out.println("\nQuotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        
        input.close();
    }
}