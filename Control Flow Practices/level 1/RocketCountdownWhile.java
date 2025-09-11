import java.util.Scanner;

// Program 8: Countdown using while loop
public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
        input.close();
    }
}
