import java.util.Scanner;

// Program 12: Sum of n natural numbers using while loop and compare with formula
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n >= 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both results are " + (sum == formulaSum ? "correct" : "not matching"));
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
