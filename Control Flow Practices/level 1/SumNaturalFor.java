import java.util.Scanner;

// Program 13: Sum of n natural numbers using for loop and compare with formula
public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n >= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both results are " + (sum == formulaSum ? "correct" : "not matching"));
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
