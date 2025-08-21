public class studentFee {
    public static void main(String[] args) {
        double coursefee = 125000;
        double discount = 10; // 10% discount
        double discountAmount = (discount / 100) * coursefee;
        double finalFee = coursefee - discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
    }
}
