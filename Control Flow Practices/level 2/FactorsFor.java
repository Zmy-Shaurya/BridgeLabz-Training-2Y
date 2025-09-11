public class FactorsFor {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FactorsFor <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
