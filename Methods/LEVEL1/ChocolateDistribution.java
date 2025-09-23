import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor <= 0) {
            System.out.println("Error: Number of children must be positive.");
            return new int[]{0, number};
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("\nEach child will get " + result[0] + " chocolates.");
        System.out.println("There will be " + result[1] + " remaining chocolates.");
        
        input.close();
    }
}