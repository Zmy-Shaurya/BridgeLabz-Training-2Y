public class MultiplesBelow100For {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java MultiplesBelow100For <k>");
            return;
        }
        int k = Integer.parseInt(args[0]);
        System.out.print("Multiples of " + k + " below 100: ");
        for (int i = k; i < 100; i += k) System.out.print(i + " ");
        System.out.println();
    }
}
