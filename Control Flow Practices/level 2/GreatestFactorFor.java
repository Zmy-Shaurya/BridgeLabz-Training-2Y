public class GreatestFactorFor {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java GreatestFactorFor <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int greatest = 1;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) greatest = i;
        }
        System.out.println("Greatest proper factor of " + n + " is: " + greatest);
    }
}
