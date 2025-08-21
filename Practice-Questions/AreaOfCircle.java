import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("area = "+area);
    }
}
