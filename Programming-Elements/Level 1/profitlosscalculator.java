public class profitlosscalculator {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;

        double profitPercentage = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f%n", costPrice, sellingPrice);
        System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f%%", profit, profitPercentage);
        }
}