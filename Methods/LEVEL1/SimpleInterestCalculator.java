import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("\nThe Simple Interest is " + interest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);
                           
        input.close();
    }
}