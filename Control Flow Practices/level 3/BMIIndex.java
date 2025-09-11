import java.util.Scanner;

public class BMIIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();
        double heightInMeter = heightInCm / 100;

        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
