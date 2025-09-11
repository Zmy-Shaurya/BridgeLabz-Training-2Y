public class YoungestAndTallest {
    public static void main(String[] args) {
        // Expecting 6 arguments: age1 height1 age2 height2 age3 height3
        if (args.length < 6) {
            System.out.println("Usage: java YoungestAndTallest <age1> <height1> <age2> <height2> <age3> <height3>");
            return;
        }
        int age1 = Integer.parseInt(args[0]);
        double h1 = Double.parseDouble(args[1]);
        int age2 = Integer.parseInt(args[2]);
        double h2 = Double.parseDouble(args[3]);
        int age3 = Integer.parseInt(args[4]);
        double h3 = Double.parseDouble(args[5]);

        // youngest
        int youngestAge = age1;
        if (age2 < youngestAge) youngestAge = age2;
        if (age3 < youngestAge) youngestAge = age3;

        // tallest
        double tallestHeight = h1;
        if (h2 > tallestHeight) tallestHeight = h2;
        if (h3 > tallestHeight) tallestHeight = h3;

        System.out.println("Youngest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
