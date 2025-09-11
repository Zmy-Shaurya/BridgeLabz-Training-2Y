import java.util.Scanner;

// Program 16: Print odd and even numbers between 1 and user input
public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
