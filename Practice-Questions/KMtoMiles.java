import java.util.Scanner;

public class KMtoMiles {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        double miles = kilometers * 0.621371;
        
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
