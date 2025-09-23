import java.util.Scanner;

public class q6_BMI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of persons: ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer number of persons.");
                return;
            }
            int n = sc.nextInt();
            if (n <= 0) {
                System.err.println("Invalid number. Must be positive.");
                return;
            }

            double[] weight = new double[n];
            double[] height = new double[n];
            double[] bmi = new double[n];
            String[] status = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Person %d - weight (kg): ", i + 1);
                while (!sc.hasNextDouble()) {
                    System.err.println("Invalid weight. Enter a numeric value.");
                    sc.next();
                }
                double w = sc.nextDouble();
                if (w <= 0) {
                    System.err.println("Invalid weight. Must be positive.");
                    i--;
                    continue;
                }

                System.out.printf("Person %d - height (m): ", i + 1);
                while (!sc.hasNextDouble()) {
                    System.err.println("Invalid height. Enter a numeric value.");
                    sc.next();
                }
                double h = sc.nextDouble();
                if (h <= 0) {
                    System.err.println("Invalid height. Must be positive.");
                    i--;
                    continue;
                }

                weight[i] = w;
                height[i] = h;
                bmi[i] = w / (h * h);

                double b = bmi[i];
                if (b <= 18.4) status[i] = "Underweight";
                else if (b <= 24.9) status[i] = "Normal";
                else if (b <= 39.9) status[i] = "Overweight";
                else status[i] = "Obese";
            }

            System.out.println();
            System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                        i + 1, weight[i], height[i], bmi[i], status[i]);
            }
        }
    }
}
