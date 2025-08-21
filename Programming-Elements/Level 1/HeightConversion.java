import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        double heightInInches = heightInCm / 2.54;
        double feet = Math.floor(heightInInches / 12);
        double inches = Math.floor(heightInInches % 12);

        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
        scanner.close();
    }
}
