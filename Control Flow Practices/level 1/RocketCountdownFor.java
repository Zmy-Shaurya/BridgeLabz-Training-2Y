import java.util.Scanner;

// Program 9: Countdown using for loop
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
        input.close();
    }
}
