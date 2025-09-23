import java.util.Scanner;

class q2_posNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > 0) {
                String parity = (n % 2 == 0) ? "even" : "odd";
                System.out.println(n + " is positive and " + parity + ".");
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println(n + " is zero.");
            }
        }

        int first = nums[0];
        int last = nums[nums.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}
