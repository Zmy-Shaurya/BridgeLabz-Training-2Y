public class PowerFor {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java PowerFor <base> <exponent>");
            return;
        }
        long base = Long.parseLong(args[0]);
        int exp = Integer.parseInt(args[1]);
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);
    }
}
