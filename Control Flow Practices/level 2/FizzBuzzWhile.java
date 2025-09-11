public class FizzBuzzWhile {
    public static void main(String[] args) {
        int n = 100;
        if (args.length >= 1) n = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
    }
}
