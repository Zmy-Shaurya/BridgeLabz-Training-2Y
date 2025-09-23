import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + 
               ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (must be <= 50): ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour (must be >= 3): ");
        double windSpeed = input.nextDouble();

        if (temp > 50 || windSpeed < 3) {
            System.out.println("\nThe formula is not valid for the given inputs.");
            System.out.println("Please ensure temperature is 50°F or less and wind speed is 3 mph or more.");
        } else {
            double windChill = calculateWindChill(temp, windSpeed);
            System.out.printf("\nThe wind chill temperature is: %.2f°F%n", windChill);
        }
        
        input.close();
    }
}