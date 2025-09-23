import java.util.Scanner;

public class CollinearChecker {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point 3 (x3 y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean bySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nResult using slope formula: Points are " + (bySlope ? "Collinear" : "Not Collinear"));

        boolean byArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Result using area formula: Points are " + (byArea ? "Collinear" : "Not Collinear"));

        scanner.close();
    }
}