import java.util.Scanner;

public class CoordinateGeometry {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return new double[]{Double.POSITIVE_INFINITY, x1};
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("\nThe Euclidean distance between the points is: %.4f%n", distance);

        double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation[0] == Double.POSITIVE_INFINITY) {
            System.out.printf("The equation of the line is a vertical line: x = %.2f%n", equation[1]);
        } else {
            System.out.printf("The equation of the line is: y = %.2fx + (%.2f)%n", equation[0], equation[1]);
        }

        scanner.close();
    }
}