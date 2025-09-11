public class PowerWhile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java PowerWhile <base> <exponent>");
            return;
        }
        long base = Long.parseLong(args[0]);
        int exp = Integer.parseInt(args[1]);
        long result = 1;
        int i = 0;
        while (i < exp) {
            result *= base;
            i++;
        }
        System.out.println(base + "^" + exp + " = " + result);
    }
}
