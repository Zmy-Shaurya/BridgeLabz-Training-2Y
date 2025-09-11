public class EmployeeBonus2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java EmployeeBonus2 <salary> <yearsWorked>");
            return;
        }
        double salary = Double.parseDouble(args[0]);
        int years = Integer.parseInt(args[1]);
        double bonus = (years > 5) ? salary * 0.10 : 0.0;
        System.out.printf("Salary: %.2f, Years: %d, Bonus: %.2f\n", salary, years, bonus);
    }
}
