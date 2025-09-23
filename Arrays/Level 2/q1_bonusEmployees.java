import java.util.Scanner;

class q1_bonusEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d - Salary: ", i + 1);
            if (!input.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a numeric salary.");
                input.next(); i--; continue;
            }
            double sal = input.nextDouble();
            if (sal <= 0) {
                System.err.println("Invalid salary. Must be positive.");
                i--; continue;
            }

            System.out.printf("Employee %d - Years of service: ", i + 1);
            if (!input.hasNextDouble()) {
                System.err.println("Invalid input. Please enter numeric years of service.");
                input.next(); i--; continue;
            }
            double yrs = input.nextDouble();
            if (yrs < 0) {
                System.err.println("Invalid years of service. Must be non-negative.");
                i--; continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            double rate = (years[i] > 5.0) ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t\t%.2f%n",
                    i + 1, salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.printf("%nTotal old salary: %.2f%n", totalOldSalary);
        System.out.printf("Total bonus payout: %.2f%n", totalBonus);
        System.out.printf("Total new salary: %.2f%n", totalNewSalary);

        input.close();
    }
}
