import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    public static void demonstrateException(int[] arr) {
        try {
            System.out.println("Attempting to access an index larger than the array length...");
            int value = arr[arr.length];
            System.out.println("Retrieved value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught successfully!");
            System.out.println("Error: The index is outside the valid range for the array.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers for the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        demonstrateException(numbers);
        
        scanner.close();
    }
}