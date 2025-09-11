import java.util.Scanner;

// Program 3: Check which number is the largest among three
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        boolean isFirstLargest = (first >= second) && (first >= third);
        boolean isSecondLargest = (second >= first) && (second >= third);
        boolean isThirdLargest = (third >= first) && (third >= second);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        input.close();
    }
}
