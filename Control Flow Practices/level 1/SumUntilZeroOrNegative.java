import java.util.Scanner;

// Program 11: Sum until user enters 0 or negative number
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();
            if (value <= 0) break;
            total += value;
        }
        System.out.println("Total sum: " + total);
        input.close();
    }
}
