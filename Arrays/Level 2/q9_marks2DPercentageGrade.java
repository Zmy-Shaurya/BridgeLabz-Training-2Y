import java.util.Scanner;

class q9_marks2DPercentageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Enter integer.");
            input.close();
            return;
        }
        int n = input.nextInt();
        if (n <= 0) {
            System.err.println("Invalid number. Must be positive.");
            input.close();
            return;
        }

        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d - Physics marks (0-100): ", i + 1);
            if (!input.hasNextInt()) { System.err.println("Invalid marks."); input.next(); i--; continue; }
            int p = input.nextInt();
            System.out.printf("Student %d - Chemistry marks (0-100): ", i + 1);
            if (!input.hasNextInt()) { System.err.println("Invalid marks."); input.next(); i--; continue; }
            int c = input.nextInt();
            System.out.printf("Student %d - Maths marks (0-100): ", i + 1);
            if (!input.hasNextInt()) { System.err.println("Invalid marks."); input.next(); i--; continue; }
            int m = input.nextInt();

            if (p < 0 || p > 100 || c < 0 || c > 100 || m < 0 || m > 100) {
                System.err.println("Invalid marks. Each should be between 0 and 100.");
                i--; continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        for (int i = 0; i < n; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = sum / 3.0;
            double pct = percentage[i];
            if (pct >= 90) grade[i] = "A";
            else if (pct >= 80) grade[i] = "B";
            else if (pct >= 70) grade[i] = "C";
            else if (pct >= 60) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        input.close();
    }
}
