import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int distanceInFeet = sc.nextInt();
        double yards = distanceInFeet / 3.0;
        double miles = distanceInFeet / 5280.0;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
