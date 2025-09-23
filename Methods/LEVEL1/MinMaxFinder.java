import java.util.Scanner;

public class MinMaxFinder {

    public static int[] findMinMax(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers:");
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Number 3: ");
        int num3 = input.nextInt();

        int[] result = findMinMax(num1, num2, num3);

        System.out.println("\nThe smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
        
        input.close();
    }
}