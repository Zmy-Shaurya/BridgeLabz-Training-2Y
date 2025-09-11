public class OddEvenRange {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java OddEvenRange <start> <end>");
            return;
        }
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        System.out.println("Number : Odd/Even");
        for (int i = start; i <= end; i++) {
            System.out.println(i + " : " + (i % 2 == 0 ? "Even" : "Odd"));
        }
    }
}
