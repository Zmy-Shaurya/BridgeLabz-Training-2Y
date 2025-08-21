import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius:");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println(c+" Celcius = "+f+ " Fahrenheit");
    }
}
