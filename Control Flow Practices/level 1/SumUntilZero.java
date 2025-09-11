import java.util.Scanner;

// Program 10: Sum numbers until user enters 0
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double value = input.nextDouble();
            if (value == 0) break;
            total += value;
        }
        System.out.println("Total sum: " + total);
        input.close();
    }
}
