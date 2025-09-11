import java.util.Scanner;

public class isfirstsmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Is the first number " + firstNumber + " the smallest? true");
        } else {
            System.out.println("Is the first number " + firstNumber + " the smallest? false");
        }

        scanner.close();
    }
}
