import java.util.Scanner;

class q5_multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        int[] results = new int[4];
        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            results[idx++] = number * i;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[idx++]);
        }

        sc.close();
    }
}
