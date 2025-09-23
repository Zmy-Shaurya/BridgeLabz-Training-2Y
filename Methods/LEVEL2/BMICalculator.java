import java.util.Scanner;

public class BMICalculator {

    public static void calculateAllBMIs(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weightKg = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            if (heightM > 0) {
                data[i][2] = weightKg / (heightM * heightM);
            } else {
                data[i][2] = 0;
            }
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 0) {
                statuses[i] = "Invalid Data";
            } else if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi < 25) {
                statuses[i] = "Normal weight";
            } else if (bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        calculateAllBMIs(teamData);
        String[] statuses = getBMIStatus(teamData);

        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-10s %-10s %-12s %-10s %-15s%n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-10.1f %-12.1f %-10.2f %-15s%n",
                (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }
        scanner.close();
    }
}