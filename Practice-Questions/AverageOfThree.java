

public class AverageOfThree {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
    }
}
