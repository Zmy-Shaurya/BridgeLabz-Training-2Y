import java.util.Scanner;

// Program 17: Employee bonus based on years of service
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus");
        }
        input.close();
    }
}
