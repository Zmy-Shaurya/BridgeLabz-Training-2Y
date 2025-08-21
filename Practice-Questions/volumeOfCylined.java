import java.util.Scanner;

public class volumeOfCylined {
    public static void main(String[] args) {
        System.out.print("Enter radius of the cylinder: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();
        
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder = " + volume);
    }
}
