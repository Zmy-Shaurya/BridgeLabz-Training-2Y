import java.util.Scanner;

// Program 5: Check if a person can vote
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        input.close();
    }
}
