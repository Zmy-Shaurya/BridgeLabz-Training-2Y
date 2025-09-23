import java.util.Scanner;

class q4_storeUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int idx = 0;

        System.out.println("Enter numbers (enter 0 or a negative number to stop). Max 10 entries.");
        while (true) {
            if (idx >= arr.length) {
                System.out.println("Reached maximum of 10 inputs.");
                break;
            }
            System.out.print("Enter number: ");
            double v = sc.nextDouble();
            if (v <= 0.0) {
                break;
            }
            arr[idx++] = v;
        }

        double sum = 0.0;
        System.out.println("You entered:");
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println("Sum of entered numbers: " + sum);
        sc.close();
    }
}
