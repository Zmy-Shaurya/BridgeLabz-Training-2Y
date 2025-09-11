public class FactorsWhile {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FactorsWhile <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.print("Factors of " + n + ": ");
        int i = 1;
        while (i <= n) {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
