import java.util.Scanner;

public class TrigCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);

        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);

        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = input.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleDegrees);

        System.out.printf("\nFor an angle of %.2f degrees:%n", angleDegrees);
        System.out.printf("Sine (sin):   %.4f%n", results[0]);
        System.out.printf("Cosine (cos): %.4f%n", results[1]);
        
        if (Double.isInfinite(results[2]) || Math.abs(results[1]) < 1e-10) {
             System.out.println("Tangent (tan): Undefined");
        } else {
             System.out.printf("Tangent (tan): %.4f%n", results[2]);
        }
        
        input.close();
    }
}