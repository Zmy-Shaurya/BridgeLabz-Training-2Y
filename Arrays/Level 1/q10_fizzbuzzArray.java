import java.util.Scanner;

class q10_fizzbuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.err.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }

        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            boolean div3 = (i % 3 == 0);
            boolean div5 = (i % 5 == 0);
            if (div3 && div5) results[i - 1] = "FizzBuzz";
            else if (div3) results[i - 1] = "Fizz";
            else if (div5) results[i - 1] = "Buzz";
            else results[i - 1] = Integer.toString(i);
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        sc.close();
    }
}
