import java.util.Scanner;

// Program 18: Multiplication table from 6 to 9
public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
