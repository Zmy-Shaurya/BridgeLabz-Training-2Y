public class MultiplesBelow100While {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java MultiplesBelow100While <k>");
            return;
        }
        int k = Integer.parseInt(args[0]);
        System.out.print("Multiples of " + k + " below 100: ");
        int i = k;
        while (i < 100) {
            System.out.print(i + " ");
            i += k;
        }
        System.out.println();
    }
}
