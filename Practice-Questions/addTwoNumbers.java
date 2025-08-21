
import java.util.Scanner;

// Source code is decompiled from a .class file using FernFlower decompiler.

public class addTwoNumbers{

   public static int addTwo(int a, int b) {
      return a + b;
   }
   public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter two numbers to add:");
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int sum = addTwo(num1, num2);
      System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
   }
}
