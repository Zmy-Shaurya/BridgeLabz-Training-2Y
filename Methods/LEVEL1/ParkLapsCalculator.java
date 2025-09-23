import java.util.Scanner;

public class ParkLapsCalculator {

    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double targetDistance = 5000.0;
        
        if (perimeter <= 0) {
            return 0;
        }
        
        return Math.ceil(targetDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the park in meters:");
        System.out.print("Side 1: ");
        double sideA = input.nextDouble();
        System.out.print("Side 2: ");
        double sideB = input.nextDouble();
        System.out.print("Side 3: ");
        double sideC = input.nextDouble();

        double roundsNeeded = computeRounds(sideA, sideB, sideC);

        System.out.println("\nThe athlete must complete " + (int)roundsNeeded + " rounds to run at least 5 km.");
        
        input.close();
    }
}