import java.util.Scanner;

class q7_bmi2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Enter integer number.");
            input.close();
            return;
        }
        int n = input.nextInt();
        if (n <= 0) {
            System.err.println("Invalid number. Must be positive.");
            input.close();
            return;
        }

        double[][] personData = new double[n][3]; // [i][0]=weight(kg), [i][1]=height(m), [i][2]=BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - weight (kg): ", i + 1);
            if (!input.hasNextDouble()) {
                System.err.println("Invalid weight. Enter numeric.");
                input.next(); i--; continue;
            }
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.err.println("Invalid weight. Must be positive.");
                i--; continue;
            }

            System.out.printf("Person %d - height (m): ", i + 1);
            if (!input.hasNextDouble()) {
                System.err.println("Invalid height. Enter numeric.");
                input.next(); i--; continue;
            }
            double height = input.nextDouble();
            if (height <= 0) {
                System.err.println("Invalid height. Must be positive.");
                i--; continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25.0) weightStatus[i] = "Normal";
            else if (bmi < 30.0) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}
