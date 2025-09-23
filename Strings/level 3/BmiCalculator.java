import java.util.Scanner;

public class BmiCalculator {

    public static String[][] processTeamData(double[][] rawData) {
        String[][] reportData = new String[rawData.length][4];
        for (int i = 0; i < rawData.length; i++) {
            double weightKg = rawData[i][0];
            double heightCm = rawData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = 0;
            if (heightM > 0) {
                bmi = weightKg / (heightM * heightM);
            }

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 40) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            reportData[i][0] = String.valueOf(weightKg);
            reportData[i][1] = String.valueOf(heightCm);
            reportData[i][2] = String.format("%.2f", bmi);
            reportData[i][3] = status;
        }
        return reportData;
    }

    public static void displayReport(String[][] reportData) {
        System.out.println("\n----------------------------------------------------------------------");
        System.out.printf("%-10s | %-15s | %-15s | %-10s | %s%n",
            "Person", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < reportData.length; i++) {
            System.out.printf("%-10d | %-15s | %-15s | %-10s | %s%n",
                (i + 1),
                reportData[i][0],
                reportData[i][1],
                reportData[i][2],
                reportData[i][3]);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        System.out.println("Please enter the weight (kg) and height (cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        String[][] finalReport = processTeamData(teamData);
        displayReport(finalReport);
        scanner.close();
    }
}