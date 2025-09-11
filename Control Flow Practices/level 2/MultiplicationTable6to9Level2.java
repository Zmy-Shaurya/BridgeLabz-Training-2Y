public class MultiplicationTable6to9Level2 {
    public static void main(String[] args) {
        for (int n = 6; n <= 9; n++) {
            System.out.println("Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", n, i, n * i);
            }
            System.out.println();
        }
    }
}
