package OnlineOrder;

public class OrderMain {
    public static void main(String[] args) {
        OrderService svc = new OrderService();
        try {
            svc.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}