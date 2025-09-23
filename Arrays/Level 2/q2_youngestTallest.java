import java.util.Scanner;

class q2_youngestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String[] names = {"Amar", "Akbar", "Anthony"};
        final int N = 3;
        int[] ages = new int[N];
        double[] heights = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter age of %s: ", names[i]);
            if (!input.hasNextInt()) {
                System.err.println("Invalid input. Enter integer age.");
                input.next(); i--; continue;
            }
            int a = input.nextInt();
            if (a <= 0) {
                System.err.println("Invalid age. Must be positive.");
                i--; continue;
            }
            ages[i] = a;

            System.out.printf("Enter height (in meters) of %s: ", names[i]);
            if (!input.hasNextDouble()) {
                System.err.println("Invalid input. Enter numeric height.");
                input.next(); i--; continue;
            }
            double h = input.nextDouble();
            if (h <= 0) {
                System.err.println("Invalid height. Must be positive.");
                i--; continue;
            }
            heights[i] = h;
        }

        int idxYoung = 0;
        int idxTall = 0;
        for (int i = 1; i < N; i++) {
            if (ages[i] < ages[idxYoung]) idxYoung = i;
            if (heights[i] > heights[idxTall]) idxTall = i;
        }

        System.out.printf("%nYoungest: %s (age %d)%n", names[idxYoung], ages[idxYoung]);
        System.out.printf("Tallest: %s (height %.2fm)%n", names[idxTall], heights[idxTall]);

        input.close();
    }
}
