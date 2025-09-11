public class GreatestFactorWhile {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java GreatestFactorWhile <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int greatest = 1;
        while (i <= n/2) {
            if (n % i == 0) greatest = i;
            i++;
        }
        System.out.println("Greatest proper factor of " + n + " is: " + greatest);
    }
}
