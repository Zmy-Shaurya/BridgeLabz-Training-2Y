import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int totalSum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + totalSum);
        }
        
        input.close();
    }
}