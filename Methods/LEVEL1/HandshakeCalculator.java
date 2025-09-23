import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        if (n < 2) {
            return 0;
        }
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        
        input.close();
    }
}
