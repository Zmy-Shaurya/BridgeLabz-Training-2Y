package OnlineOrder;

import java.util.Random;

public class OrderService {
    private final Random random = new Random();

    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        int r = random.nextInt(3); 
        if (r == 0) throw new OutOfStockException("The product is out of stock.");
        if (r == 1) throw new PaymentFailedException("Payment could not be processed.");
        System.out.println("Order placed successfully!");
    }
}